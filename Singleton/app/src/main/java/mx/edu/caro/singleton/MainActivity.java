package mx.edu.caro.singleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtTipo;
    private Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTipo=(EditText)findViewById(R.id.edt_productos);
        btnRegistrar=(Button)findViewById(R.id.btn_registrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tienda tienda = Tienda.getUnicoTipo();
                tienda.setTipoProducto(edtTipo.getText().toString());
                Toast.makeText(MainActivity.this, "Tipo de   Producto: "
                        + tienda.getTipoProducto(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
