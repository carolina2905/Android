package mx.edu.utng.prototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edtTipo;
    private EditText edtNombre;
    private EditText edtPeso;
    private Button btnClonar;
    private GridView grvPokemon;
    private ArrayList<Pokemon> pokemons;
    private Pokemon pokemon;
    private PokemonAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTipo = (EditText)findViewById(R.id.edt_tipo);
        edtNombre = (EditText)findViewById(R.id.edt_nombre);
        edtPeso = (EditText)findViewById(R.id.edt_peso);

        btnClonar = (Button)findViewById(R.id.btn_clonar);

        grvPokemon = (GridView)findViewById(R.id.grv_pokemon);

        pokemons = new ArrayList<Pokemon>();
        pokemon = new Pokemon();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               pokemon.setTipo(edtTipo.getText().toString());
               pokemon.setNombre(edtNombre.getText().toString());
               pokemon.setPeso(
                       Float.parseFloat(
                               edtPeso.getText().toString()));
                Pokemon clon = (Pokemon) pokemon.clonar();
                pokemons.add(clon);

                adapter = new PokemonAdapter(MainActivity.this,
                        (ArrayList)pokemons);
                grvPokemon.setAdapter(adapter);
            }
        });

    }
}
