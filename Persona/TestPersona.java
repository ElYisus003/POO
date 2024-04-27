package Persona;

import java.util.Scanner;

public class TestPersona {

    public static void lines() {
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        int opcion, cantidadP, edad, contador = 0, D, M, A;
        String nombre, apellido, direccion, fechaNacimiento, correo;
        char genero;
        CFecha fecha = new CFecha();

        System.out.println("Ingrese la cantidad de personas a registrar: ");
        cantidadP = tcld.nextInt();
        ControlPersona cp = new ControlPersona(cantidadP);
        System.out.println();

        do {
            System.out.println("================================================");
            System.out.println("| [1] Alta Persona                             |");
            System.out.println("| [2] Buscar Persona                           |");
            System.out.println("| [3] Reporte general de Persona               |");
            System.out.println("| [4] Baja Persona                             |");
            System.out.println("| [5] Salir                                    |");
            System.out.println("================================================");
            opcion = tcld.nextInt();

            switch (opcion) {
                case 1:
                    if(contador < cantidadP) {
                        System.out.print("Nombre: ");
                        nombre = tcld.next();
                        System.out.print("Apellido: ");
                        apellido = tcld.next();
                        System.out.print("Edad: ");
                        edad = tcld.nextInt();
                        System.out.print("Genero: ");
                        genero = tcld.next().charAt(0);
                        System.out.print("Direccion: ");
                        direccion = tcld.next();
                        System.out.print("Correo: ");
                        correo = tcld.next();
                        System.out.print("Fecha de nacimiento (DD/MM/AAAA): ");
                        D = tcld.nextInt();
                        System.out.print("/");
                        M = tcld.nextInt();
                        System.out.print("/");
                        A = tcld.nextInt();

                        fecha.asignarFecha(D, M, A);
                        fechaNacimiento = D + "/" + M + "/" + A;

                        if (fecha.fechaCorrecta() == false) {
                            System.out.println();
                            System.out.println("Fecha incorrecta, intente de nuevo.");
                            break;
                        }

                        cp.AltasPersona(nombre, apellido, edad, genero, direccion, correo, fechaNacimiento);
                        contador++;

                    } else {
                        System.out.println("No hay espacio para agregar más personas");
                    }

                    break;

                case 2:
                    System.out.print("Nombre de la persona a buscar: ");
                    nombre = tcld.next();
                    System.out.println(cp.BuscarPersona(nombre));
                    break;

                case 3:
                    System.out.println(cp.ReporteGeneralPersona());
                    break;

                case 4:
                    System.out.print("Nombre de la persona a dar de baja: ");
                    nombre = tcld.next();
                    System.out.println(cp.BajaPersona(nombre));
                    break;

                case 5:
                    System.out.println();
                    System.out.println("Saliendo...");
                    break;
            
                default:
                    System.out.println("Opcion invalida, intente de nuevo.");
                    break;
            }

            lines();

        } while (opcion != 5);
    }

}
