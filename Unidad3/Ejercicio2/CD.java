package Unidad3.Ejercicio2;

public class CD extends Publicacion{
    private float tiempoReproduccion, ventas;  

    public CD(String titulo, float precio, float tiempoReproduccion, float ventas) {
        super(titulo, precio);
        this.tiempoReproduccion = tiempoReproduccion;
        this.ventas = ventas;
    }

    public float getTiempoReproduccion() { return tiempoReproduccion; }
    public void setTiempoReproduccion(float tiempoReproduccion) { this.tiempoReproduccion = tiempoReproduccion; }

    public float getVentas() { return ventas; }
    public void setVentas(float ventas) { this.ventas = ventas; }

    @Override
    public String toString() {
        return "CD [" + "titulo=" + super.getTitulo() + ", precio=" + super.getPrecio() + ", tiempoReproduccion=" + tiempoReproduccion +
        		", ventas=" + ventas + "]";
    }

}
