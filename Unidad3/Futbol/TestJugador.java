package Unidad3.Futbol;

import java.util.Scanner;

public class TestJugador {

    public static void lines() {
        System.out.println("\n-------------------------------------------------\n");
    }

    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        String nombre, posicion;
        int numeroInforme, minutosJugados, numeroGoles, opcion, cont = 0, nJugadores;
        Jugador jugadores[] = new Jugador[11];
        Defensa defensa;
        Delantero delantero;
        Medio medio;
        Portero portero;

        do {
            System.out.println("=====================================");
            System.out.println("| [1] Registrar un portero          |");
            System.out.println("| [2] Registrar un defensa          |");
            System.out.println("| [3] Registrar un medio            |");
            System.out.println("| [4] Registrar un delantero        |");
            System.out.println("| [5] Mostrar jugadores registrados |");
            System.out.println("| [6] Salir                         |");
            System.out.println("|                                   |");
            System.out.println("| Registros disponibles: " + (11 - cont) + "         |");
            System.out.println("=====================================");
            opcion = tcld.nextInt();


                switch (opcion) {
                    case 1:
                        System.out.println("Nombre del jugador: ");
                        nombre = tcld.next();
                        System.out.println("Posicion: ");
                        posicion = tcld.next();
                        System.out.println("Numero de informe: ");
                        numeroInforme = tcld.nextInt();
                        System.out.println("Minutos jugados: ");
                        minutosJugados = tcld.nextInt();

                        portero = new Portero(nombre, posicion, numeroInforme, minutosJugados);
                        jugadores[cont] = portero;
                        cont++;

                        break;

                    case 2:
                        System.out.println("Nombre del jugador: ");
                        nombre = tcld.next();
                        System.out.println("Posicion: ");
                        posicion = tcld.next();
                        System.out.println("Numero de informe: ");
                        numeroInforme = tcld.nextInt();
                        System.out.println("Minutos jugados: ");
                        minutosJugados = tcld.nextInt();
                        System.out.println("Numero de goles: ");
                        numeroGoles = tcld.nextInt();

                        defensa = new Defensa(nombre, posicion, numeroInforme, minutosJugados, numeroGoles);
                        jugadores[cont] = defensa;
                        cont++;

                        break;

                    case 3:
                        System.out.println("Nombre del jugador: ");
                        nombre = tcld.next();
                        System.out.println("Posicion: ");
                        posicion = tcld.next();
                        System.out.println("Numero de informe: ");
                        numeroInforme = tcld.nextInt();
                        System.out.println("Minutos jugados: ");
                        minutosJugados = tcld.nextInt();
                        System.out.println("Numero de goles: ");
                        numeroGoles = tcld.nextInt();

                        medio = new Medio(nombre, posicion, numeroInforme, minutosJugados, numeroGoles);
                        jugadores[cont] = medio;
                        cont++;

                        break;

                    case 4:
                        System.out.println("Nombre del jugador: ");
                        nombre = tcld.next();
                        System.out.println("Posicion: ");
                        posicion = tcld.next();
                        System.out.println("Numero de informe: ");
                        numeroInforme = tcld.nextInt();
                        System.out.println("Minutos jugados: ");
                        minutosJugados = tcld.nextInt();
                        System.out.println("Numero de goles: ");
                        numeroGoles = tcld.nextInt();

                        delantero = new Delantero(nombre, posicion, numeroInforme, minutosJugados, numeroGoles);
                        jugadores[cont] = delantero;
                        cont++;

                        break;

                    case 5:
                        for (int i = 0; i < cont; i++) {
                            System.out.println(jugadores[i].toString());
                        }
                        break;

                    case 6:
                        System.out.println("Saliendo...");
                        break;
                
                    default:
                        System.out.println("Opcion no valida");
                        break;

                }

            lines();

        } while (opcion != 6);
    }

}
