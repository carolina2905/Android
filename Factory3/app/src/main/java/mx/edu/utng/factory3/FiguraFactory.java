package mx.edu.utng.factory3;

/**
 * Created by caro on 13/09/2016.
 */
public class FiguraFactory {
    private Figura figura;

    public Figura crearFigura(String tipo){
        if(tipo!=null){
            if(tipo.equalsIgnoreCase("panda")){
                figura = new Panda();
                //}else if(tipo.equalsIgnoreCase("volkswagen")){
                //   figura = new Volkswagen();
            }else {
                return null;
            }
        }
        return figura;
    }
}
