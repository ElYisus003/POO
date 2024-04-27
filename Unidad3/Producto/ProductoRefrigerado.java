package Unidad3.Producto;

public class ProductoRefrigerado extends Producto {
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
    public String toString() {
        return "ProductoRefrigerado [nombre=" + getNombre() + ", fechaCaducidad=" + getFechaCaducidad() + ", numeroLote=" + getNumeroLote()
                + ", costoProduccion=" + getCostoProduccion() + ", codigoSupAlimentaria=" + codigoSupAlimentaria + "]";
    }

}
