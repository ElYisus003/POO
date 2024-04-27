package Unidad3.Restaurante;

public class Ensalada extends Alimento {
    private boolean pollo, sal, tenedor, cuchillo;

    public Ensalada(String nombre, float precio, boolean pollo, boolean sal, boolean tenedor, boolean cuchillo) {
        super(nombre, precio);
        this.pollo = pollo;
        this.sal = sal;
        this.tenedor = tenedor;
        this.cuchillo = cuchillo;
    }

    public String getPollo() {
        if (pollo) return "Con pollo";
        else return "Sin pollo";
    }

    public String getSal() {
        if (sal) return "Con sal";
        else return "Sin sal";
    }

    public String getTenedor() {
        if (tenedor) return "Con tenedor";
        else return "Sin tenedor";
    }

    public String getCuchillo() {
        if (cuchillo) return "Con cuchillo";
        else return "Sin cuchillo";
    }

    public String toString() {

        return "ENSALADA \n" + 
                "Nombre: " + getNombre() + "\n" +
                "Precio: " + getPrecio() + "\n" +
                "Ingredientes: " + getPollo() + ", " + getSal() + "\n" +
                "Se come: " + getTenedor() + ", " + getCuchillo();
    }

}
