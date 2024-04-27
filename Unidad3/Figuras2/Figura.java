package Unidad3.Figuras2;

public abstract class Figura {
    private String nombreFigura;

    public Figura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public String getNombreFigura() { return nombreFigura; }
    public void setNombreFigura(String nombreFigura) { this.nombreFigura = nombreFigura; }

    public float obtenerVolumen() { return 0; }

    public float obtenerArea() { return 0; }

    public abstract String imprimir();

    public abstract String obtenerNombre();
    
}
