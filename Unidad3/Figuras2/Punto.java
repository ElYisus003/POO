package Unidad3.Figuras2;

public class Punto extends Figura {
    private int x;
    private int y;

    public Punto(int x, int y, String nombreFigura) {
        super(nombreFigura);
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    @Override
    public String imprimir() {
        return "Punto: " + getNombreFigura() + " [" + x + ", " + y + "]";
    }

    @Override
    public String obtenerNombre() {
        return "La figura es un Punto, llamado: " + super.getNombreFigura();
    }

    @Override
    public float obtenerArea() {
        return 0;
    }

    @Override
    public float obtenerVolumen() {
        return 0;
    }



}
