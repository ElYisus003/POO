package Unidad3.Figuras2;

public class Cilindro extends Circulo {
    private float altura;

    public Cilindro(int x, int y, int radio, float altura, String nombreFigura) {
        super(x, y, radio, nombreFigura);
        this.altura = altura;
    }

    public float getAltura() { return altura; }
    public void setAltura(float altura) { this.altura = altura; }

    @Override
    public float obtenerArea() {
        return (float) ((2 * obtenerArea()) + (2 * Math.PI * getRadio() * altura));
    }

    @Override
    public float obtenerVolumen() {
        return (float) (obtenerArea() * altura);
    }

    @Override
    public String imprimir() {
        return "Cilindro: " + " [" + getX() + ", " + getY() + "] Radio: " + getRadio() + " Altura: " + altura;
    }

    @Override
    public String obtenerNombre() {
        return "La figura es un Cilindro, llamado: " + super.getNombreFigura();
    }

}
