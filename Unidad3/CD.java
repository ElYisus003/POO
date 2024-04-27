package Unidad3;

public class CD extends Publicacion{
    private float tiempoReproduccion;

    public CD(String titulo, float precio, float tiempoReproduccion) {
        super(titulo, precio);
        this.tiempoReproduccion = tiempoReproduccion;
    }

    public float getTiempoReproduccion() { return tiempoReproduccion; }
    public void setTiempoReproduccion(float tiempoReproduccion) { this.tiempoReproduccion = tiempoReproduccion; }

    @Override
    public String toString() {
        return "CD [" + "titulo=" + super.getTitulo() + ", precio=" + super.getPrecio() + ", tiempoReproduccion=" + tiempoReproduccion + "]";
    }

}
