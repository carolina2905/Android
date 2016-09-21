package mx.edu.utng.factory;

/**
 * Created by TICLAB1 on 30/08/2016.
 */
public class FiguraFactory {

    private Figura figura;

    public Figura crearFigura(String tipo){
        if (tipo==null){
            return null;
        }
        if (tipo.equalsIgnoreCase("Circulo")){
            return new Circulo();
        }else if (tipo.equalsIgnoreCase("Estrella")){
            return new Estrella();
        }else if (tipo.equalsIgnoreCase("Rectangulo")){
            return new Rectangulo();
        }else if (tipo.equalsIgnoreCase("Triangulo")){
            return new Triangulo();
        }else if (tipo.equalsIgnoreCase("carita")){
            return new carita();
        }else if (tipo.equalsIgnoreCase("Casita")){
            return new Casita();
        }else if (tipo.equalsIgnoreCase("Pino")){
            return new Pino();
        }else if (tipo.equalsIgnoreCase("Corazon")){
            return new Corazon();
        }else if (tipo.equalsIgnoreCase("Lapiz")){
            return new Lapiz();
        }
        return null;
    }
}
