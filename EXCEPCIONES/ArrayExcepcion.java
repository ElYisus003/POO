package EXCEPCIONES;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayExcepcion {

    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        int[] calificaciones = new int[5];

        try {
            for (int i=0; i<=5; i++) {
                System.out.print("Ingrese la calificación " + (i+1) + ": ");
                calificaciones[i] = tcld.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\n" + "Error: índice fuera de rango.");
        } catch (InputMismatchException ex) {
            System.out.println("\n" + "Error: el valor ingresado no es un número entero.");
        }
    }

}
