package Examen_Unidad4y5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Numero {
	public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor;

        try{
        System.out.println("Introduce un valor: ");
        valor=teclado.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Error: No se introdujo un valor entero");
        }
   }
}
