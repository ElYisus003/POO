package Unidad3.Producto;

public class ProductoCongelado extends Producto implements OTROS_COSTOS{
    private int temperaturaCongelacion;

    public ProductoCongelado(String nombre, String fechaCaducidad, int numeroLote, double costoProduccion, int temperaturaCongelacion) {
        super(nombre, fechaCaducidad, numeroLote, costoProduccion);
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    public int getTemperaturaCongelacion() { return temperaturaCongelacion; }
    public void setTemperaturaCongelacion(int temperaturaCongelacion) { this.temperaturaCongelacion = temperaturaCongelacion; }

    public double precioVenta() {
        return getCostoProduccion() + (getCostoProduccion() * 0.3) + (getCostoProduccion() * 0.1)
                + (getCostoProduccion() * 0.21) + (getCostoProduccion() * 0.6);
    }

    @Override
    public double calculaOtrosCostos() {
        return rentaMaquinaria + mantoEquipo + costoTransporte;
    }

    @Override
    public double costoDepFisAF() {
        return valorAF * 0.03;
    }

    @Override
    public String toString() {
        return "ProductoCongelado [nombre=" + getNombre() + ", fechaCaducidad=" + getFechaCaducidad() + ", numeroLote=" + getNumeroLote()
                + ", costoProduccion=" + getCostoProduccion() + ", temperaturaCongelacion=" + temperaturaCongelacion + "]";
    }

}
