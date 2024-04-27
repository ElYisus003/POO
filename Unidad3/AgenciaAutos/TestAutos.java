package Unidad3.AgenciaAutos;

import java.util.Scanner;

public class TestAutos {

    public static void lines() {
        System.out.println("\n------------------------------------------------\n");
    }
    
    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        String marca, numeroSerie;
        int año, capacidadPasajeros, ejes, rodadas, opcion, cont=0, nAutos;
        float precio, capacidadCarga;
        Autos ArrayAutos[] = new Autos[10];
        AutosCompactos autocompacto;
        AutosDeLujo autodelujo;
        Camionetas camioneta;
        Vagonetas vagoneta;


        do {
            System.out.println("==================================");
            System.out.println("| [1] Registrar Auto Compacto    |");
            System.out.println("| [2] Registrar Auto de Lujo     |");
            System.out.println("| [3] Registrar Camioneta        |");
            System.out.println("| [4] Registrar Vagoneta         |");
            System.out.println("| [5] Mostrar Autos              |");
            System.out.println("| [6] Salir                      |");
            System.out.println("|                                |");
            System.out.println("| Registros diponibles: " + (10-cont) + "       |");
            System.out.println("==================================");
            opcion = tcld.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Marca: ");
                    marca = tcld.next();
                    System.out.println("Numero de serie: ");
                    numeroSerie = tcld.next();
                    System.out.println("Año: ");
                    año = tcld.nextInt();
                    System.out.println("Precio: ");
                    precio = tcld.nextFloat();
                    System.out.println("Capacidad de pasajeros: ");
                    capacidadPasajeros = tcld.nextInt();

                    autocompacto = new AutosCompactos(marca, numeroSerie, año, precio, capacidadPasajeros);
                    ArrayAutos[cont] = autocompacto;
                    cont++;

                    break;
                
                case 2:
                    System.out.println("Marca: ");
                    marca = tcld.next();
                    System.out.println("Numero de serie: ");
                    numeroSerie = tcld.next();
                    System.out.println("Año: ");
                    año = tcld.nextInt();
                    System.out.println("Precio: ");
                    precio = tcld.nextFloat();
                    System.out.println("Capacidad de pasajeros: ");
                    capacidadPasajeros = tcld.nextInt();

                    autodelujo = new AutosDeLujo(marca, numeroSerie, año, precio, capacidadPasajeros);
                    ArrayAutos[cont] = autodelujo;
                    cont++;

                    break;

                case 3:
                    System.out.println("Marca: ");
                    marca = tcld.next();
                    System.out.println("Numero de serie: ");
                    numeroSerie = tcld.next();
                    System.out.println("Año: ");
                    año = tcld.nextInt();
                    System.out.println("Precio: ");
                    precio = tcld.nextFloat();
                    System.out.println("Capacidad de carga: ");
                    capacidadCarga = tcld.nextFloat();
                    System.out.println("Ejes: ");
                    ejes = tcld.nextInt();
                    System.out.println("Rodadas: ");
                    rodadas = tcld.nextInt();

                    camioneta = new Camionetas(marca, numeroSerie, año, precio, capacidadCarga, ejes, rodadas);
                    ArrayAutos[cont] = camioneta;
                    cont++;

                    break;

                case 4:
                    System.out.println("Marca: ");
                    marca = tcld.next();
                    System.out.println("Numero de serie: ");
                    numeroSerie = tcld.next();
                    System.out.println("Año: ");
                    año = tcld.nextInt();
                    System.out.println("Precio: ");
                    precio = tcld.nextFloat();
                    System.out.println("Capacidad de pasajeros: ");
                    capacidadPasajeros = tcld.nextInt();

                    vagoneta = new Vagonetas(marca, numeroSerie, año, precio, capacidadPasajeros);
                    ArrayAutos[cont] = vagoneta;
                    cont++;

                    break;

                case 5:
                    for (int i = 0; i < cont; i++) {
                        System.out.println(ArrayAutos[i]);
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
