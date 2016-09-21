package mx.edu.utng.stateentregable;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by ulises on 08/09/2016.
 */
public class Apagado extends ControlRemoto {

    @Override
    public void presionarSwitch(Tv tv, Canvas canvas) {
        tv.setEstado(new Encendido());
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);

        float mitadX = canvas.getWidth();
        float mitadY = canvas.getHeight();

        paint.setColor(Color.BLACK);
        canvas.drawRect(mitadX*0.10f, mitadY*0.10f,
                mitadX*0.9f, mitadY*0.5f, paint);

        paint.setColor(Color.BLUE);
        canvas.drawRect(mitadX * 0.15f, mitadY * 0.25f,
                mitadX * 0.85f, mitadY*0.45f, paint);

        paint.setColor(Color.RED);
        canvas.drawRect(mitadX * 0.9f, mitadY * 0.20f,
                mitadX * 0.55f, mitadY*0.85f, paint);
    }
}
