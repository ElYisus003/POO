package Unidad3.Personas;

import java.util.Scanner;

public class TestPersonas {

    public static void lines() {
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        String nombre, domicilio;
        float salario, limiteCredito;
        int cont = 0, opcion;
        Cliente cliente;
        Empleado empleado;
        Persona ArrayPersona[] = new Persona[10];

        do {

            System.out.println("====================================");
            System.out.println("| [1] Agregar Empleado             |");
            System.out.println("| [2] Agregar Cliente              |");
            System.out.println("| [3] Mostrar Personas             |");
            System.out.println("| [4] Salir                        |");
            System.out.println("====================================");
            opcion = tcld.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Nombre: ");
                    nombre = tcld.next();
                    System.out.println("Domicilio: ");
                    domicilio = tcld.next();
                    System.out.println("Salario: ");
                    salario = tcld.nextFloat();
                    
                    empleado = new Empleado(nombre, domicilio, salario);
                    ArrayPersona[cont] = empleado;
                    cont++;

                    break;

                case 2:
                    System.out.println("Nombre: ");
                    nombre = tcld.next();
                    System.out.println("Domicilio: ");
                    domicilio = tcld.next();
                    System.out.println("Limite de Credito: ");
                    limiteCredito = tcld.nextFloat();

                    cliente = new Cliente(nombre, domicilio, limiteCredito);
                    ArrayPersona[cont] = cliente;
                    cont++;

                    break;

                case 3:
                    for (int i = 0; i < cont; i++) {
                        System.out.println(ArrayPersona[i]);
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida, intente de nuevo.");
                    break;
            }
            
            lines();

        } while (opcion != 4);
    }

}
