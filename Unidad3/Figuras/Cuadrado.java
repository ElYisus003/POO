package Unidad3.Figuras;

public class Cuadrado extends Cuadrilatero{

    public Cuadrado(float lado) {
        super(lado, lado);
    }

    public float calcularArea() {
        return getBase() * getAltura();
    }

    @Override
    public String toString() {
        return "Cuadrado [lado=" + getBase() + ", area=" + calcularArea() + "]";
    }

}
