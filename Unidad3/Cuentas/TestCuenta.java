package Unidad3.Cuentas;

import java.util.Scanner;

public class TestCuenta {

    static Scanner tcld = new Scanner(System.in);

    public static void lines() {
        System.out.println("\n=====================================\n");
    }

    public static void menuCambiosCA(CuentaAhorro ca) {
        int opcion;
        do {
           System.out.println("CuentaAhorro con sus datros actuales.\n"
                                +"Presione la opción correspondiente");
            
            System.out.println("[1] Nombre: " + ca.getNombre());
            System.out.println("[2] Cuenta: " + ca.getCuenta());
            System.out.println("[3] Saldo: " + ca.getSaldo());
            System.out.println("[4] Tipo de interes: " + ca.getTipoInteres());
            System.out.println("[5] Cuota de mantenimiento: " + ca.getCuotaMantenimiento());
            System.out.println("[6] Salir");
            opcion = tcld.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nuevo nombre: ");
                    String nombre = tcld.next();
                    ca.setNombre(nombre);
                    break;

                case 2:
                    System.out.print("Nueva cuenta: ");
                    String cuenta = tcld.next();
                    ca.setCuenta(cuenta);
                    break;

                case 3:
                    System.out.print("Nuevo saldo: ");
                    double saldo = tcld.nextDouble();
                    ca.setSaldo(saldo);
                    break;

                case 4:
                    System.out.print("Nuevo tipo de interes: ");
                    double tipoInteres = tcld.nextDouble();
                    ca.setTipoInteres(tipoInteres);
                    break;

                case 5:
                    System.out.print("Nueva cuota de mantenimiento: ");
                    double cuotaMantenimiento = tcld.nextDouble();
                    ca.setCuotaMantenimiento(cuotaMantenimiento);
                    break;
            
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }

        } while (opcion != 6);
    }

    public static void menuCambiosCC(CuentaCorriente cc) {
        int opcion;
        do {
            System.out.println("CuentaCorriente con sus datros actuales.\n"
                                +"Presione la opción correspondiente");
            
            System.out.println("[1] Nombre: " + cc.getNombre());
            System.out.println("[2] Cuenta: " + cc.getCuenta());
            System.out.println("[3] Saldo: " + cc.getSaldo());
            System.out.println("[4] Tipo de interes: " + cc.getTipoInteres());
            System.out.println("[5] Importe de transaccion: " + cc.getImporteTransaccion());
            System.out.println("[6] Transacciones exentas: " + cc.getTransaccionesExentas());
            System.out.println("[7] Salir");
            opcion = tcld.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nuevo nombre: ");
                    String nombre = tcld.next();
                    cc.setNombre(nombre);
                    break;

                case 2:
                    System.out.print("Nueva cuenta: ");
                    String cuenta = tcld.next();
                    cc.setCuenta(cuenta);
                    break;

                case 3:
                    System.out.print("Nuevo saldo: ");
                    double saldo = tcld.nextDouble();
                    cc.setSaldo(saldo);
                    break;

                case 4:
                    System.out.print("Nuevo tipo de interes: ");
                    double tipoInteres = tcld.nextDouble();
                    cc.setTipoInteres(tipoInteres);
                    break;

                case 5:
                    System.out.print("Nuevo importe de transaccion: ");
                    double importeTransaccion = tcld.nextDouble();
                    cc.setImporteTransaccion(importeTransaccion);
                    break;

                case 6:
                    System.out.print("Nuevas transacciones excentas: ");
                    int transaccionesExcentas = tcld.nextInt();
                    cc.setTransaccionesExentas(transaccionesExcentas);
                    break;
            
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }

        } while (opcion != 7);
    }

    public static void main(String[] args) {
        ControlCuenta control = new ControlCuenta();
        Cuenta c;
        CuentaAhorro ca;
        CuentaCorriente cc;
        String nombre, cuenta;
        double saldo, tipoInteres, cuotaMantenimiento, importeTransaccion;
        int transaccionesExcentas, opcion;

        do {
            System.out.println("=====================================");
            System.out.println("| [1] Crear cuenta de ahorro        |");
            System.out.println("| [2] Crear cuenta corriente        |");
            System.out.println("| [3] Listar cuentas                |");
            System.out.println("| [4] Cambios                       |");
            System.out.println("| [5] Depositos                     |");
            System.out.println("| [6] Retiros                       |");
            System.out.println("| [7] Reporte Cuentas Corrientes    |");
            System.out.println("| [8] Reporte Cuentas Ahorro        |");
            System.out.println("| [9] Buscar una cuenta             |");
            System.out.println("| [10] Salir                        |");
            System.out.println("=====================================");
            opcion = tcld.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    nombre = tcld.next();
                    System.out.print("Cuenta: ");
                    cuenta = tcld.next();
                    System.out.print("Saldo: ");
                    saldo = tcld.nextDouble();
                    System.out.print("Tipo de interes: ");
                    tipoInteres = tcld.nextDouble();
                    System.out.print("Cuota de mantenimiento: ");
                    cuotaMantenimiento = tcld.nextDouble();

                    ca = new CuentaAhorro(nombre, cuenta, saldo, tipoInteres, cuotaMantenimiento);
                    
                    if (control.altaCuenta(ca)) System.out.println("Cuenta de ahorro creada correctamente");
                    else System.out.println("No se pudo crear la cuenta de ahorro");

                    break;

                case 2:
                    System.out.print("Nombre: ");
                    nombre = tcld.next();
                    System.out.print("Cuenta: ");
                    cuenta = tcld.next();
                    System.out.print("Saldo: ");
                    saldo = tcld.nextDouble();
                    System.out.print("Tipo de interes: ");
                    tipoInteres = tcld.nextDouble();
                    System.out.print("Importe de transaccion: ");
                    importeTransaccion = tcld.nextDouble();
                    System.out.print("Transacciones exentas: ");
                    transaccionesExcentas = tcld.nextInt();

                    cc = new CuentaCorriente(nombre, cuenta, saldo, tipoInteres, importeTransaccion, transaccionesExcentas);

                    if(control.altaCuenta(cc)) System.out.println("Cuenta corriente creada correctamente");
                    else System.out.println("No se pudo crear la cuenta corriente");
                    
                    break;

                case 3:
                    System.out.println(control.reporteGeneral());
                    break;
                
                case 4:
                    System.out.print("Nombre de la cuenta: ");
                    nombre = tcld.next();

                    int pos = control.buscarPosicion(nombre);

                    if(pos != -1) {
                        c = control.regresaCuenta(pos);

                        if(c instanceof CuentaAhorro) {
                            ca = (CuentaAhorro) c;
                        }
                        if(c instanceof CuentaCorriente) {
                            cc = (CuentaCorriente) c;
                        } else {
                            System.out.println("No se encontro la cuenta");
                        }

                    }
                    break;

                case 5:
                    System.out.print("Nombre de la cuenta: ");
                    nombre = tcld.next();
                    System.out.print("Cantidad a depositar: ");
                    double cantidad = tcld.nextDouble();

                    System.out.println(control.depositar(cantidad, nombre));
                    break;

                case 6:
                    System.out.print("Nombre de la cuenta: ");
                    nombre = tcld.next();
                    System.out.print("Cantidad a retirar: ");
                    double cantidadRetiro = tcld.nextDouble();

                    System.out.println(control.retirar(cantidadRetiro, nombre));
                    break;

                case 7:
                    System.out.println(control.reporteCCorriente());
                    break;

                case 8:
                    System.out.println(control.reporteCAhorro());
                    break;

                case 9:
                    System.out.print("Nombre de la cuenta: ");
                    nombre = tcld.next();
                    System.out.println(control.buscarCuenta(nombre));
                    break;

                case 10:
                    System.out.println("Saliendo...");
                    break;
            
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
            lines();
        } while (opcion != 10);
    }

}
