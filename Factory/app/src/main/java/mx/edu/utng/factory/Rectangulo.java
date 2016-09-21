package mx.edu.utng.factory;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by TICLAB1 on 30/08/2016.
 */
public class Rectangulo implements Figura {

    @Override
    public void dibujar(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);

        Path path=new Path();

        float ancho = canvas.getWidth();
        float largo = canvas.getHeight();

        canvas.drawRect(10,10, ancho-50,70, paint);

        path.close();
        canvas.drawPath(path,paint);


    }
}
