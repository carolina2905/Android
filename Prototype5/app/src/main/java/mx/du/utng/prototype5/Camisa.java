package mx.du.utng.prototype5;

/**
 * Created by Lab2 on 14/09/2016.
 */
public class Camisa implements Clonable{

        private String marca;
        private String color;

        public Camisa(){
            this.marca = "";
            this.color = "";
        }

        public Camisa(String marca, String color) {
            this.marca = marca;
            this.color = color;
        }

        @Override
        public Clonable clonar() {
            Camisa clon = new Camisa(marca, color);
            return clon;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

    }
