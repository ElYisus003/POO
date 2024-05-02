package EXCEPCIONES;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionXCero {

    public static void lines() {
        System.out.println("\n" + "=".repeat(80) + "\n");
    }

    public static int division(int numerador, int denominador) {

        try {
            return numerador / denominador;
        } catch (ArithmeticException px) {
            System.out.println("Error: no se puede dividir entre cero.");    
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner tcld  = new Scanner(System.in);
        int numero1=0, numero2=0, resultado;

        lines();
        try {
            System.out.print("Ingrese el primer número: ");
            numero1 = tcld.nextInt();
            System.out.print("Ingrese el segundo número: ");
            numero2 = tcld.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("\n" + "La excepción capturada es: " + e.toString());
        }


        System.out.println();
        resultado = division(numero1, numero2);

        System.out.println("\n" + "El resultado de la división es: " + resultado);
        lines();
    }

}
