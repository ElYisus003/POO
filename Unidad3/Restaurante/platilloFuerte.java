package Unidad3.Restaurante;

public class platilloFuerte extends Alimento {
    private boolean carne, pollo, sal, tenedor, cuchillo;

    public platilloFuerte(String nombre, float precio, boolean carne, boolean pollo, boolean sal, boolean tenedor, boolean cuchillo) {
        super(nombre, precio);
        this.carne = carne;
        this.pollo = pollo;
        this.sal = sal;
        this.tenedor = tenedor;
        this.cuchillo = cuchillo;
    }

    public String getCarne() {
        if (carne) return "Con carne";
        else return "Sin carne";
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
        return "PLATILLO FUERTE \n" + 
                "Nombre: " + getNombre() + "\n" +
                "Precio: " + getPrecio() + "\n" +
                "Ingredientes: " + getCarne() + ", " + getPollo() + ", " + getSal() + "\n" +
                "Se come: " + getTenedor() + ", " + getCuchillo();
    }

}
