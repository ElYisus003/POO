package EXCEPCIONES;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeerNumero {

    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        int calificaciones[] = new int[5];
        int valor, suma=0;
        boolean continuar;

        do {

            try {
                continuar = false;

                for(int i=0; i<5; i++) {
                    System.out.print("Ingrese la calificación " + (i+1) + ": ");
                    valor = tcld.nextInt();
                    suma += valor;
                }
                System.out.println("El promedio de las calificaciones es: " + (suma/5));
                
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número entero.");
                System.out.println("Ingrese nuevamente la calificaión: ");
                tcld.next();
                continuar = true;
            }

        } while (continuar);

    }

}
