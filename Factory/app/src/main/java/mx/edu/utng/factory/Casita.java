package mx.edu.utng.factory;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by TICLAB1 on 30/08/2016.
 */
public class Casita implements Figura{

    @Override
    public void dibujar(Canvas canvas) {
        Paint paint = new Paint();
        Paint paint2 = new Paint();
        paint2.setColor(Color.BLUE);
        paint2.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GRAY);
        paint.setStyle(Paint.Style.FILL);

        Path path = new Path();
        Path pared = new Path();

        float ancho = canvas.getWidth()/2;
        float alto = canvas.getHeight()/2;

        path.moveTo(ancho-100, alto);
        path.lineTo(ancho-100, alto);
        path.lineTo(ancho+100, alto);
        path.lineTo(ancho, alto-70);
        path.close();

        pared.moveTo(ancho-80, alto);
        pared.lineTo(ancho-80, alto);
        pared.lineTo(ancho+80, alto);
        pared.lineTo(ancho+80, alto+80);
        pared.lineTo(ancho-80, alto+80);
        pared.close();

        canvas.drawPath(path,paint);
        canvas.drawPath(pared,paint2);


    }
}
