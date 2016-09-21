package mx.edu.caro.singleton2;

/**
 * Created by caro on 13/09/2016.
 */
public class Granja {
    private static Granja Tipo;
    private String RazaAnimal;

    private Granja() { this.RazaAnimal+="";}

    public String getRazaAnimal() {
        return RazaAnimal;
    }

    public void setRazaAnimal(String razaAnimal) {
        RazaAnimal = razaAnimal;
    }

    public static Granja getTipo(){
        if(Tipo==null){
            Tipo=new Granja();
        }
        return Tipo;
    }
}
