package mx.edu.caro.singleton2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtAnimal;
    private Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtAnimal=(EditText)findViewById(R.id.edt_animales);
        btnRegistrar=(Button)findViewById(R.id.btn_registrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Granja granja =Granja.getTipo();
                granja.setRazaAnimal(edtAnimal.getText().toString());
                Toast.makeText(MainActivity.this, "Tipo de Animal: "
                        + granja.getTipo(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}

