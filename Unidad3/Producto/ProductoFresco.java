package Unidad3.Producto;

public class ProductoFresco extends Producto implements OTROS_COSTOS{
    private String fechaEnvasado;
    private String paisOrigen;
    
	public ProductoFresco(String nombre, String fechaCaducidad, int numeroLote, double costoProduccion,
			String fechaEnvasado, String paisOrigen) {
		super(nombre, fechaCaducidad, numeroLote, costoProduccion);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}

    public String getFechaEnvasado() { return fechaEnvasado; }
    public void setFechaEnvasado(String fechaEnvasado) { this.fechaEnvasado = fechaEnvasado; }

    public String getPaisOrigen() { return paisOrigen; }
    public void setPaisOrigen(String paisOrigen) { this.paisOrigen = paisOrigen; }

    public double precioVenta() {
        return getCostoProduccion() + (getCostoProduccion() * 0.3);
    }

    @Override
    public double calculaOtrosCostos() {
        return rentaMaquinaria + costoTransporte;
    }
    
    @Override
	public double costoDepFisAF() {
		return valorAF * 0.01;
	}

    @Override
    public String toString() {
        return "ProductoFresco [nombre=" + getNombre() + ", fechaCaducidad=" + getFechaCaducidad() + ", numeroLote=" + getNumeroLote()
                + ", costoProduccion=" + getCostoProduccion() + ", fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen + "]";
    }
	
}
