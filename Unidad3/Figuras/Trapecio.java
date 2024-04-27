package Unidad3.Figuras;

public class Trapecio extends Cuadrilatero{
    private float baseMenor;

    public Trapecio(float base, float baseMenor, float altura) {
        super(base, altura);
        this.baseMenor = baseMenor;
    }

    public float getBaseMenor() { return baseMenor; }
    public void setBaseMenor(float baseMenor) { this.baseMenor = baseMenor; }

    public float calcularArea() {
        return (getBase() + baseMenor) * getAltura() / 2;
    }

    @Override
    public String toString() {
        return "Trapecio [base=" + getBase() + ", baseMenor=" + baseMenor + ", altura=" + getAltura() + ", area=" + calcularArea() + "]";
    }

}
