package Unidad2;

import java.util.Scanner;

public class test_rectangulo {
    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        double largo, ancho, tiempo;
        Rectangulo Ventana = new Rectangulo();
        Rectangulo Pared = new Rectangulo();
        
        //ACTUALIZAR EL LARGO Y ANCHO DEL OBJETO PARED
        System.out.print("Ingrese el largo de la pared: ");
        largo = tcld.nextDouble();
        Pared.modificarLargo(largo);
        System.out.print("Ingrese el ancho de la pared: ");
        ancho = tcld.nextDouble();
        Pared.modificarAncho(ancho);

        System.out.println();

        //ACTUALIZAR EL LARGO Y ANCHO DEL OBJETO VENTANA
        System.out.print("Ingrese el largo de la ventana: ");
        largo = tcld.nextDouble();
        Ventana.modificarLargo(largo);
        System.out.print("Ingrese el ancho de la ventana: ");
        ancho = tcld.nextDouble();
        Ventana.modificarAncho(ancho);

        System.out.println();

        //CALCULAR EL TIEMPO QUE SE TARDA EN PINTAR LA PARED
        tiempo = ((Pared.calcularArea() - Ventana.calcularArea()) * 10) / 60;
        System.out.println("El tiempo que se tarda en pintar la pared es: " + tiempo + " horas");
        
    }

}
