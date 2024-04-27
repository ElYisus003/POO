package Unidad3.Figuras;

public class Rectangulo extends Cuadrilatero{

    public Rectangulo(float base, float altura) {
        super(base, altura);
    }

    public float calcularArea() {
        return getBase() * getAltura();
    }

    @Override
    public String toString() {
        return "Rectangulo [base=" + getBase() + ", altura=" + getAltura() + ", area=" + calcularArea() + "]";
    }

}
