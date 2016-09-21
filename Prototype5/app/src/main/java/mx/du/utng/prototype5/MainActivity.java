package mx.du.utng.prototype5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edtMarca;
    private EditText edtColor;
    private Button btnClonar;
    private GridView grvCamisa;
    private ArrayList<Camisa> camisas;
    private Camisa camisa;
    private CamisaAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMarca = (EditText) findViewById(R.id.edt_marca);
        edtColor = (EditText) findViewById(R.id.edt_color);

        btnClonar = (Button)findViewById(R.id.btn_clonar);
        grvCamisa = (GridView)findViewById(R.id.grv_camisa);
        camisas = new ArrayList<Camisa>();
        camisa = new Camisa();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                camisa.setMarca(edtMarca.getText().toString());
                camisa.setColor(edtColor.getText().toString());

                Camisa clon = (Camisa) camisa.clonar();

                camisas.add(clon);

                adapter = new CamisaAdapter(MainActivity.this, camisas);
                grvCamisa.setAdapter(adapter);
            }
        });
    }
}