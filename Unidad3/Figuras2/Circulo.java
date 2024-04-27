package Unidad3.Figuras2;

public class Circulo extends Punto {
    private int radio;

    public Circulo(int x, int y, int radio, String nombreFigura) {
        super(x, y, nombreFigura);
        this.radio = radio;
    }

    public int getRadio() { return radio; }
    public void setRadio(int radio) { this.radio = radio; }

    @Override
    public float obtenerArea() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }

    @Override
    public String imprimir() {
        return "Circulo: " + " [" + getX() + ", " + getY() + "] Radio: " + radio;
    }

    @Override
    public String obtenerNombre() {
        return "La figura es un Circulo, llamado: " + super.getNombreFigura();
    }

    @Override
    public float obtenerVolumen() {
        return 0;
    }
}
