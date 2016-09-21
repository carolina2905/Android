package mx.edu.utng.prototype;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 08/09/2016.
 */
public class PokemonAdapter extends  ArrayAdapter<Pokemon>{
    public PokemonAdapter(Context context, ArrayList<Pokemon> pokemons){
        super(context,0, pokemons);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Pokemon pokemon = getItem(position);
        if(convertView==null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.pokemon, parent, false);
        }

        TextView txvPomenon = (TextView)convertView.findViewById(R.id.txv_pokemon);

        txvPomenon.setText(pokemon.getTipo()+ " "+pokemon.getNombre());

        return convertView;
    }
}
