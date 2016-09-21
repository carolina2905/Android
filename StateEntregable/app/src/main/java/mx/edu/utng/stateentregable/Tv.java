package mx.edu.utng.stateentregable;

import android.graphics.Canvas;

/**
 * Created by ulises on 08/09/2016.
 */
public class Tv {
    private ControlRemoto estado;
    private Canvas canvas;

    public Tv(ControlRemoto estado){
        this.estado = estado;
    }

    public ControlRemoto getEstado() {
        return estado;
    }

    public void setEstado(ControlRemoto estado) {
        this.estado = estado;
    }

    public void presionarBoton(){
        estado.presionarSwitch(this, canvas);
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }
}
