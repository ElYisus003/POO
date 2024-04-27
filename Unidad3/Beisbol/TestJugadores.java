package Unidad3.Beisbol;

import java.util.Scanner;

public class TestJugadores {

    public static void lines() {
        System.out.println("\n------------------------------------------------\n");
    }

    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        String nombre, posicion;
        int numeroUniforme, ponches, numeroErrores, hits, opcion, cont = 0;
        Jugadores jugadores[] = new Jugadores[10];
        Pitchers pitchers;
        Bateadores bateadores;
        Posicion Posicion;

        do {
            System.out.println("===================================");
            System.out.println("| [1] Agregar Pitcher             |");
            System.out.println("| [2] Agregar Bateador            |");
            System.out.println("| [3] Agregar Jugador de Posicion |");
            System.out.println("| [4] Mostrar Jugadores           |");
            System.out.println("| [5] Salir                       |");
            System.out.println("|                                 |");
            System.out.println("| Registros disponibles: " + (10 - cont) + "       |");
            System.out.println("===================================");
            opcion = tcld.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Nombre del jugador: ");
                    nombre = tcld.next();
                    System.out.println("Posicion: ");
                    posicion = tcld.next();
                    System.out.println("Numero de uniforme: ");
                    numeroUniforme = tcld.nextInt();
                    System.out.println("Ponches: ");
                    ponches = tcld.nextInt();
                    System.out.println("Numero de errores: ");
                    numeroErrores = tcld.nextInt();

                    pitchers = new Pitchers(nombre, posicion, numeroUniforme, ponches, numeroErrores);
                    jugadores[cont] = pitchers;
                    cont++;

                    break;

                case 2:
                    System.out.println("Nombre del jugador: ");
                    nombre = tcld.next();
                    System.out.println("Posicion: ");
                    posicion = tcld.next();
                    System.out.println("Numero de uniforme: ");
                    numeroUniforme = tcld.nextInt();
                    System.out.println("Hits: ");
                    hits = tcld.nextInt();

                    bateadores = new Bateadores(nombre, posicion, numeroUniforme, hits);
                    jugadores[cont] = bateadores;
                    cont++;

                    break;

                case 3:
                    System.out.println("Nombre del jugador: ");
                    nombre = tcld.next();
                    System.out.println("Posicion: ");
                    posicion = tcld.next();
                    System.out.println("Numero de uniforme: ");
                    numeroUniforme = tcld.nextInt();
                    System.out.println("Hits: ");
                    hits = tcld.nextInt();
                    System.out.println("Numero de errores: ");
                    numeroErrores = tcld.nextInt();

                    Posicion = new Posicion(nombre, posicion, numeroUniforme, hits, numeroErrores);
                    jugadores[cont] = Posicion;
                    cont++;

                    break;

                case 4:
                    for (int i = 0; i < cont; i++) {
                        System.out.println(jugadores[i]);
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

            lines();

        } while (opcion != 5);
    }

}
