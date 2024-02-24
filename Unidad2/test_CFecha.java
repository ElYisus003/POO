package Unidad2;

import java.util.Scanner;

public class test_CFecha {

    public static void lines() {
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println();
    }

    public static void imprimirFecha(CFecha fecha) {
        int array[] = new int[3];
        fecha.obtenerFecha(array);
        System.out.println("La fecha es: " + array[0] + "/" + array[1] + "/" + array[2]);
    }
	public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        CFecha fecha1 = new CFecha();
        int dia, mes, año;

        do{
        lines();
        System.out.print("Introduce el día: ");
        dia = tcld.nextInt();
        System.out.print("Introduce el mes: ");
        mes = tcld.nextInt();
        System.out.print("Introduce el año: ");
        año = tcld.nextInt();

        fecha1.asignarFecha(dia, mes, año);
        }while(fecha1.fechaCorrecta() == false);

        System.out.println();
        imprimirFecha(fecha1);

    }

}
