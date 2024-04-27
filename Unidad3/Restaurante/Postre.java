package Unidad3.Restaurante;

public class Postre extends Alimento {
    private boolean cuchara, tenedor, azucar;

    public Postre(String nombre, float precio, boolean cuchara, boolean tenedor, boolean azucar) {
        super(nombre, precio);
        this.cuchara = cuchara;
        this.tenedor = tenedor;
        this.azucar = azucar;
    }

    public String getCuchara() {
        if (cuchara) return "Con cuchara";
        else return "Sin cuchara";
    }

    public String getTenedor() {
        if (tenedor) return "Con tenedor";
        else return "Sin tenedor";
    }

    public String getAzucar() {
        if (azucar) return "Con azucar";
        else return "Sin azucar";
    }

    public String toString() {
        return "POSTRE \n" + 
                "Nombre: " + getNombre() + "\n" +
                "Precio: " + getPrecio() + "\n" +
                "Ingredientes: " + getAzucar() + "\n" +
                "Se come: " + getTenedor() + ", " + getCuchara();
    }

}
