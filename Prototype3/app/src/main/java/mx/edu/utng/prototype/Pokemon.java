package mx.edu.utng.prototype;

/**
 * Created by user on 08/09/2016.
 */
public class Pokemon implements Replica {
    private String tipo;
    private String nombre;
    private float peso;

    public Pokemon() {
        this.tipo = "";
        this.nombre = "";
        this.peso = 0.0f;
    }

    public Pokemon(String tipo, String nombre, float peso) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.peso = peso;
    }

    @Override
    public Replica clonar() {
        Pokemon clon = new Pokemon();
        clon.setTipo(tipo);
        clon.setNombre(nombre);
        clon.setPeso(peso);
        return clon;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String raza) {
        this.tipo = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String color) {
        this.nombre = color;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }


}
