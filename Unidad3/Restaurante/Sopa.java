package Unidad3.Restaurante;

public class Sopa extends Alimento {
    private boolean pollo, sal;
    private final boolean chuchara = true;

    public Sopa(String nombre, float precio, boolean pollo, boolean sal) {
        super(nombre, precio);
        this.pollo = pollo;
        this.sal = sal;
    }

    public String getPollo() {
        if (pollo) return "Con pollo";
        else return "Sin pollo";
    }

    public String getSal() {
        if (sal) return "Con sal";
        else return "Sin sal";
    }

    public String getChuchara() {
        return "Con cuchara";
    }

    public String toString() {
        return "SOPA \n" + 
                "Nombre: " + getNombre() + "\n" +
                "Precio: " + getPrecio() + "\n" +
                "Ingredientes: " + getPollo() + ", " + getSal() + "\n" +
                "Se come: " + getChuchara();
    }

}
