package Unidad2;

public class Rectangulo {
    private double largo;
    private double ancho;

    public double calcularArea() {
        return largo * ancho;
    }

    public void modificarLargo(double l) {
        largo = l;
    }

    public void modificarAncho(double a) {
        ancho = a;
    }

    public double consulatrLargo() {
        return largo;
    }

    public double consultarAncho() {
        return ancho;
    }

}
