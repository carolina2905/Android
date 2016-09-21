package mx.edu.utng.factory;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by TICLAB1 on 30/08/2016.
 */
public class Lienzo extends View {

    private Figura figura;

    public Lienzo(Context context, Figura figura){
        super(context);
        this.figura=figura;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (figura!=null){
            figura.dibujar(canvas);
        }
    }

    public Figura getFigura() {
        return figura;
    }

    public void setFigura(Figura figura) {
        this.figura = figura;
    }
}
