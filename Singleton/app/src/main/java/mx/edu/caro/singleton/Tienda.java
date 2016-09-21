package mx.edu.caro.singleton;

/**
 * Created by caro on 13/09/2016.
 */
public class Tienda {
    private static Tienda unicoTipo;
    private String tipoProducto;

    private Tienda() { this.tipoProducto+="";}

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    public static Tienda getUnicoTipo(){
        if(unicoTipo==null){
            unicoTipo=new Tienda();
        }
        return unicoTipo;
    }
}
