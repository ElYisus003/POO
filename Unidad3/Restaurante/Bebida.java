package Unidad3.Restaurante;

public class Bebida extends Alimento {
    private boolean popote, azucar;
    private final boolean vaso = true;

    public Bebida(String nombre, float precio, boolean popote) {
        super(nombre, precio);
        this.popote = popote;
    }

    public String toString() {
        if(popote == true && azucar == true) {
            return "BEBIDA \n" + 
                "Nombre: " + getNombre() + "\n" +
                "Precio: " + getPrecio() + "\n" +
                "La bebida viene en un vaso, contiene un popote y azucar";
        } else if(popote == true && azucar == false) {
            return "BEBIDA \n" + 
                "Nombre: " + getNombre() + "\n" +
                "Precio: " + getPrecio() + "\n" +
                "La bebida viene en un vaso y contiene un popote";
        } else {
            return "BEBIDA \n" + 
                "Nombre: " + getNombre() + "\n" +
                "Precio: " + getPrecio() + "\n" +
                "La bebida viene en un vaso";
        }

    }

}
