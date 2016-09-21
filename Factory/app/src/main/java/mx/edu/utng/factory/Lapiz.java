package mx.edu.utng.factory;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by TICLAB1 on 30/08/2016.
 */
public class Lapiz implements Figura{

    @Override
    public void dibujar(Canvas canvas) {
        Paint paint = new Paint();
        Paint paint2 = new Paint();
        paint2.setColor(Color.BLUE);
        paint2.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);

        Path path = new Path();
        Path pared = new Path();

        float ancho = canvas.getWidth()/2;
        float alto = canvas.getHeight()/2;

        canvas.drawCircle(ancho,alto-300,30,paint);

        paint.setColor(Color.YELLOW);
        path.moveTo(ancho-15, alto-300);
        path.lineTo(ancho+15, alto-300);
        path.moveTo(ancho+15, alto+300);
        path.lineTo(ancho-15, alto+300);
        path.close();
        canvas.drawPath(path,paint);

        paint.setColor(Color.BLACK);
        path.moveTo(ancho+15, alto+200);
        path.lineTo(ancho-15, alto+200);
        path.lineTo(ancho, alto+345);
        path.close();
        canvas.drawPath(path,paint);

    }
}
