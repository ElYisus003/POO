package Unidad3;

import java.util.Scanner;

public class TestPublicacion {

    public static void lines() {
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        Publicacion ArrayPublicacion[] = new Publicacion[20];
        Libro libro;
        CD cd;
        int opcion, numeroPaginas, cont = 0;
        String titulo;
        float precio, tiempoReproduccion;

        do {
            System.out.println("====================================");
            System.out.println("| [1] Alta de CD's                 |");
            System.out.println("| [2] Alta de Libros               |");
            System.out.println("| [3] Mostrar todo                 |");
            System.out.println("| [4] Salir                        |");
            System.out.println("====================================");
            opcion = tcld.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el titulo del CD: ");
                    titulo = tcld.next();
                    System.out.println("Ingrese el precio del CD: ");
                    precio = tcld.nextFloat();
                    System.out.println("Ingrese el tiempo de reproduccion del CD: ");
                    tiempoReproduccion = tcld.nextFloat();

                    cd = new CD(titulo, precio, tiempoReproduccion);
                    ArrayPublicacion[cont] = cd;
                    cont++;

                    break;

                case 2:
                    System.out.println("Ingrese el titulo del libro: ");
                    titulo = tcld.next();
                    System.out.println("Ingrese el precio del libro: ");
                    precio = tcld.nextFloat();
                    System.out.println("Ingrese el numero de paginas del libro: ");
                    numeroPaginas = tcld.nextInt();

                    libro = new Libro(titulo, precio, numeroPaginas);
                    ArrayPublicacion[cont] = libro;
                    cont++;

                    break;

                case 3:
                    for (int i = 0; i < cont; i++) {
                        System.out.println(ArrayPublicacion[i].toString());
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;
            
                default:
                    System.out.println("Opcion no valida, intente de nuevo");
                    break;
            }

            lines();
            
        } while (opcion != 4);
        //Alta CD's
        //Alta de Libros
        //Mostrar todo
        //Salir
    }

}
