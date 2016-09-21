package mx.du.utng.prototype5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lab2 on 14/09/2016.
 */
public class CamisaAdapter extends ArrayAdapter<Camisa> {

        public CamisaAdapter(Context context, ArrayList<Camisa> camisas){
            super(context, 0, camisas);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            Camisa camisa = getItem(position);
            if(convertView==null){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.camisa_layout, parent, false);
            }
            TextView txvCamisa = (TextView)convertView.findViewById(R.id.txv_camisa);
            txvCamisa.setText(camisa.getMarca()+"-"+camisa.getColor());

            return convertView;
        }

    }
