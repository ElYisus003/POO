package Unidad3.Producto;

import java.io.Serializable;

public abstract class Producto implements Serializable{
    private String nombre, fechaCaducidad;
    private int numeroLote;
    private double costoProduccion;

    public Producto(String nombre, String fechaCaducidad, int numeroLote, double costoProduccion) {
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.costoProduccion = costoProduccion;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getFechaCaducidad() { return fechaCaducidad; }
    public void setFechaCaducidad(String fechaCaducidad) { this.fechaCaducidad = fechaCaducidad; }

    public int getNumeroLote() { return numeroLote; }
    public void setNumeroLote(int numeroLote) { this.numeroLote = numeroLote; }

    public double getCostoProduccion() { return costoProduccion; }
    public void setCostoProduccion(double costoProduccion) { this.costoProduccion = costoProduccion; }

    public abstract double precioVenta();

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote
				+ ", costoProduccion=" + costoProduccion + "]";
	}

}
