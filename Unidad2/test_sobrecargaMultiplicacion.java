package Unidad2;

public class test_sobrecargaMultiplicacion {
    public static void main(String[] args) {
        sobrecargaMultiplicacion objeto1 = new sobrecargaMultiplicacion(12, 10);

        System.out.println("Multiplicacion: " + objeto1.multiplicar());
        System.out.println("Multiplicacion con 5: " + objeto1.multiplicar(5));
        System.out.println("Multiplicacion con 20: " + objeto1.multiplicar(20L));
        System.out.println("Multiplicacion con 7 y 8: " + objeto1.multiplicar(7, (byte)8));
        System.out.println("Multiplicacion con 4 y 2: " + objeto1.multiplicar((byte)4, 2));
    }

}
