package Unidad2;

public class Circunferencia {
    private double radio;

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public void modificarRadio(double r) {
        radio = r;
    }

    public double consultarRadio() {
        return radio;
    }

}
