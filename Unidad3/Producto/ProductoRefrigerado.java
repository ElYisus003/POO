package Unidad3.Producto;

import java.io.Serializable;

public class ProductoRefrigerado extends Producto implements OTROS_COSTOS, Serializable {
    private int codigoSupAlimentaria;

    public ProductoRefrigerado(String nombre, String fechaCaducidad, int numeroLote, double costoProduccion, int codigoSupAlimentaria) {
        super(nombre, fechaCaducidad, numeroLote, costoProduccion);
        this.codigoSupAlimentaria = codigoSupAlimentaria;
    }

    public int getCodigoSupAlimentaria() { return codigoSupAlimentaria; }
    public void setCodigoSupAlimentaria(int codigoSupAlimentaria) { this.codigoSupAlimentaria = codigoSupAlimentaria; }

    public double precioVenta() {
        return getCostoProduccion() + (getCostoProduccion() * 0.3) + (getCostoProduccion() * 0.1);
    }

    @Override
    public double calculaOtrosCostos() {
        return rentaMaquinaria + mantoEquipo;
    }

    @Override
    public double costoDepFisAF() {
        return valorAF * 0.02;
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado [nombre=" + getNombre() + ", fechaCaducidad=" + getFechaCaducidad() + ", numeroLote=" + getNumeroLote()
                + ", costoProduccion=" + getCostoProduccion() + ", codigoSupAlimentaria=" + codigoSupAlimentaria + "]";
    }

}
