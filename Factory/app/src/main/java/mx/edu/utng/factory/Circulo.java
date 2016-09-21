package mx.edu.utng.factory;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by TICLAB1 on 30/08/2016.
 */
public class Circulo implements Figura{

    @Override
    public void dibujar(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);

        float mitad = canvas.getWidth()/2;
        float min = Math.min(canvas.getWidth(),canvas.getHeight());
        float half= min/2;

        canvas.drawCircle(mitad,half,100,paint);
    }
}
