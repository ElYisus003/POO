package Unidad2;

public class TestLeer {

    public static void lines() {
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        short numeroShort;
        int numeroInt;
        long numeroLong;
        float numeroFloat;
        double numeroDouble;

        lines();
        System.out.print("Dame un numero short: ");
        numeroShort = Leer.datoShort();
        System.out.print("Dame un numero int: ");
        numeroInt = Leer.datoInt();
        System.out.print("Dame un numero long: ");
        numeroLong = Leer.datoLong();
        System.out.print("Dame un numero float: ");
        numeroFloat = Leer.datoFloat();
        System.out.print("Dame un numero double: ");
        numeroDouble = Leer.datoDouble();

        lines();
        System.out.println("El numero short es: " + numeroShort);
        System.out.println("El numero int es: " + numeroInt);
        System.out.println("El numero long es: " + numeroLong);
        System.out.println("El numero float es: " + numeroFloat);
        System.out.println("El numero double es: " + numeroDouble);
    }

}
