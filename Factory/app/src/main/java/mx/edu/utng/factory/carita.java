package mx.edu.utng.factory;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by TICLAB1 on 30/08/2016.
 */
public class carita implements Figura{

    @Override
    public void dibujar(Canvas canvas) {
        Paint paint = new Paint();
        Paint ojos = new Paint();

        float ancho = canvas.getWidth()/2;
        float alto = canvas.getHeight()/2;

        Path risa = new Path();
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        ojos.setColor(Color.BLACK);
        ojos.setStyle(Paint.Style.FILL);

        float mitad = canvas.getWidth()/2;
        float min = Math.min(canvas.getWidth(),canvas.getHeight());
        float half= min/2;

        canvas.drawCircle(mitad,half,150,paint);
        canvas.drawCircle(mitad-45,half-45,30,ojos);
        canvas.drawCircle(mitad+45,half-45,30,ojos);

        risa.moveTo(ancho-80, alto);
        risa.lineTo(ancho+80, alto);
        risa.lineTo(ancho+80, alto+10);
        risa.lineTo(ancho-80, alto+10);
        risa.close();

        canvas.drawCircle(mitad+45,half-45,30,ojos);
        canvas.drawPath(risa,ojos);


    }
}
