package PROYECTO_U2;

import java.util.Scanner;

public class test_Agenda {
    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        int opcion, telefono;
        String nombre, apellidoP, apellidoM, correo, fechaNacimiento;
        byte edad;
        Agenda agenda;
        controlAgenda cA = new controlAgenda();

        do {
            System.out.println("=========================================");
			System.out.println("| [1] Agregar objetos a la agenda       |");
			System.out.println("| [2] Listar todos los objetos          |");
			System.out.println("| [3] Salir                             |");
			System.out.println("=========================================");
			opcion = tcld.nextInt();

            switch(opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    nombre = tcld.next();
                    System.out.print("Apellido paterno: ");
                    apellidoP = tcld.next();
                    System.out.print("Apellido materno: ");
                    apellidoM = tcld.next();
                    System.out.print("Correo: ");
                    correo = tcld.next();
                    System.out.print("Fecha de nacimiento: ");
                    fechaNacimiento = tcld.next();
                    System.out.print("Telefono: ");
                    telefono = tcld.nextInt();
                    System.out.print("Edad: ");
                    edad = tcld.nextByte();

                    agenda = new Agenda(nombre, apellidoP, apellidoM, correo, fechaNacimiento, telefono, edad);
                    cA.agregaAgenda(agenda);
                    
                    break;
                case 2:
                    System.out.println(cA.reporteGeneral());
                    break;
                case 3:
                    System.out.println("Hay de rato mi todo tibio, saludos a la family.");
                    break;
                default:
                    System.out.println("Opcion invalida, ");
                    break;
            }
        } while(opcion != 3);
        
    }

}
