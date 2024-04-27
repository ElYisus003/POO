package Unidad3.Figuras;

import java.util.Scanner;

public class TestFiguras {

    public static void lines() {
        System.out.println("\n------------------------------------------------\n");
    }

    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        float base, altura, baseMenor;
        int opcion, cont=0;
        Cuadrilatero[] figuras = new Cuadrilatero[10];
        Trapecio trapecio;
        Cuadrado cuadrado;
        Rectangulo rectangulo;

        do {
            System.out.println("===================================");
            System.out.println("| [1] Agregar cuadrado            |");
            System.out.println("| [2] Agregar rectángulo          |");
            System.out.println("| [3] Agregar trapecio            |");
            System.out.println("| [4] Mostrar figuras             |");
            System.out.println("| [5] Salir                       |");
            System.out.println("|                                 |");
            System.out.println("| Registros disponibles: " + (10-cont) + "       |");
            System.out.println("===================================");
            opcion = tcld.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el lado del cuadrado: ");
                    base = tcld.nextFloat();

                    cuadrado = new Cuadrado(base);
                    figuras[cont] = cuadrado;
                    cont++;
                    
                    break;
            
                case 2:
                    System.out.println("Ingrese la base del rectángulo: ");
                    base = tcld.nextFloat();
                    System.out.println("Ingrese la altura del rectángulo: ");
                    altura = tcld.nextFloat();

                    rectangulo = new Rectangulo(base, altura);
                    figuras[cont] = rectangulo;
                    cont++;
                    
                    break;

                case 3:
                    System.out.println("Ingrese la base del trapecio: ");
                    base = tcld.nextFloat();
                    System.out.println("Ingrese la base menor del trapecio: ");
                    baseMenor = tcld.nextFloat();
                    System.out.println("Ingrese la altura del trapecio: ");
                    altura = tcld.nextFloat();

                    trapecio = new Trapecio(base, baseMenor, altura);
                    figuras[cont] = trapecio;
                    cont++;
                    
                    break;

                case 4:
                    for (int i = 0; i < cont; i++) {
                        System.out.println(figuras[i]);
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
            
            lines();
            
        } while (opcion != 5);
    }

}
