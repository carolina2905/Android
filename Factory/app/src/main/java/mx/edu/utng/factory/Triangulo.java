package mx.edu.utng.factory;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by TICLAB1 on 30/08/2016.
 */
public class Triangulo implements Figura {

    @Override
    public void dibujar(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL);

        Path path = new Path();

        float ancho = canvas.getWidth()/2;
        float alto = canvas.getHeight()/2;

        path.moveTo(ancho, alto);
        path.lineTo(ancho*0.5f, alto*1.5f);
        path.lineTo(ancho*1.5f, alto*1.5f);
        path.lineTo(ancho, alto*0.5f);
        path.close();
        canvas.drawPath(path,paint);
    }
}
