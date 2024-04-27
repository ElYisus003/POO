package EXAMEN_APELLIDO_PATERNO;

import java.util.Scanner;

public class TestTarjetaCredito {

    public static void lines() {
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        int opcion;
        String nombreCliente;
        int numeroCuenta;
        byte codigoCliente;
        float saldo;
        TarjetaCredito tarjeta;
        ControlTarjetaCredito controlT = new ControlTarjetaCredito();

        do {
            System.out.println("======================================");
            System.out.println("| [1] Alta Tarjeta                   |");
            System.out.println("| [2] Reporte general                |");
            System.out.println("| [3] Salir                          |");
            System.out.println("======================================");
            opcion = tcld.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    nombreCliente = tcld.next();
                    System.out.print("Número de cuenta: ");
                    numeroCuenta = tcld.nextInt();
                    System.out.print("Código del cliente: ");
                    codigoCliente = tcld.nextByte();
                    System.out.print("Saldo: ");
                    saldo = tcld.nextFloat();

                    tarjeta = new TarjetaCredito(nombreCliente, numeroCuenta, codigoCliente, saldo);
                    controlT.agregarTarjeta(tarjeta);

                    break;
                case 2:
                    System.out.println(controlT.reporteGeneral());
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }

            lines();

        } while (opcion != 3);
    }

}
