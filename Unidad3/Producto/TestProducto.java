package Unidad3.Producto;

import java.util.Scanner;

public class TestProducto {

    public static void lines(){
        System.out.println("\n------------------------------------------------\n");
    }

    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        String nombre, nuevoN, fechaCaducidad, nuevaFC, fechaEnvasado, paisOrigen;
        int numeroLote, nuevoNL, temperaturaCongelacion, codigoSupAlimentaria, opcion, opcionMod,
            opcionAltas, cont = 0, max;
        double costoProduccion, nuevoCP;
        Producto producto;

        System.out.println("Cuantos productos deseas registrar? ");
        max = tcld.nextInt();
        ControlProducto cP = new ControlProducto(max);

        do {
            System.out.println("==================================");
            System.out.println("| [1] Alta de producto           |");
            System.out.println("| [2] Baja de producto           |");
            System.out.println("| [3] Buscar producto            |");
            System.out.println("| [4] Modificar producto         |");
            System.out.println("| [5] Reporte de productos       |");
            System.out.println("| [6] Calcular precio de venta   |");
            System.out.println("| [7] Salir                      |");
            System.out.println("|                                |");
            System.out.println("| Registros disponibles: " + (max-cont) + "       |");
            System.out.println("==================================");
            opcion = tcld.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("==================================");
                    System.out.println("| Escoge un tipo de producto:    |");
                    System.out.println("|                                |");
                    System.out.println("| [1] Producto Fresco            |");
                    System.out.println("| [2] Producto Refrigerado       |");
                    System.out.println("| [3] Producto Congelado         |");
                    System.out.println("==================================");
                    opcionAltas = tcld.nextInt();

                    System.out.println("Nombre del producto: ");
                    nombre = tcld.next();
                    System.out.println("Fecha de caducidad: ");
                    fechaCaducidad = tcld.next();
                    System.out.println("Numero de lote: ");
                    numeroLote = tcld.nextInt();
                    System.out.println("Costo de produccion: ");
                    costoProduccion = tcld.nextDouble();
                    
                    switch(opcionAltas){
                        case 1:
                            System.out.println("Fecha de envasado: ");
                            fechaEnvasado = tcld.next();
                            System.out.println("Pais de origen: ");
                            paisOrigen = tcld.next();
                            producto = new ProductoFresco(nombre, fechaCaducidad, numeroLote, costoProduccion, fechaEnvasado, paisOrigen);
                            cP.Altas(producto);
                            cont++;
                            break;
                        case 2:
                            System.out.println("Codigo de supervicion alimentaria: ");
                            codigoSupAlimentaria = tcld.nextInt();
                            producto = new ProductoRefrigerado(nombre, fechaCaducidad, numeroLote, costoProduccion, codigoSupAlimentaria);
                            cP.Altas(producto);
                            cont++;
                            break;
                        case 3:
                            System.out.println("Temperatura de congelacion: ");
                            temperaturaCongelacion = tcld.nextInt();
                            producto = new ProductoCongelado(nombre, fechaCaducidad, numeroLote, costoProduccion, temperaturaCongelacion);
                            cP.Altas(producto);
                            cont++;
                            break;
                    }
                    break;

                case 2:
                    System.out.print("Nombre del producto a eliminar: ");
                    nombre = tcld.next();
                    if(cP.Bajas(nombre) == true) {
                    	cP.Bajas(nombre);
                    	System.out.println("Producto eliminado exitosamente");
                    }
                    else System.out.println("Error, producto no encontrado");
                    cont--;
                    break;

                case 3:
                    System.out.print("Nombre del producto a buscar: ");
                    nombre = tcld.next();
                    System.out.println(cP.Buscar(nombre));
                    break;

                case 4:
                    System.out.print("Nombre del producto a modificar: ");
                    nombre = tcld.next();
                    System.out.println(cP.Buscar(nombre));

                    do {
                        System.out.println("==================================");
                        System.out.println("| ¿Qué deseas modificar?         |");
                        System.out.println("|                                |");
                        System.out.println("| [1] Nombre                     |");
                        System.out.println("| [2] Fecha de caducidad         |");
                        System.out.println("| [3] Numero de lote             |");
                        System.out.println("| [4] Costo de produccion        |");
                        System.out.println("| [5] Regresar                   |");
                        System.out.println("==================================");
                        opcionMod = tcld.nextInt();

                        switch(opcionMod){
                            case 1:
                                System.out.print("Nuevo nombre: ");
                                nuevoN = tcld.next();
                                cP.Cambios(nombre, nuevoN, 1, 0, 0);
                                break;
                            case 2:
                                System.out.print("Nueva fecha de caducidad: ");
                                nuevaFC = tcld.next();
                                cP.Cambios(nombre, nuevaFC, 2, 0, 0);
                                break;
                            case 3:
                                System.out.print("Nuevo numero de lote: ");
                                nuevoNL = tcld.nextInt();
                                cP.Cambios(nombre, null, 3, nuevoNL, 0);
                                break;
                            case 4:
                                System.out.print("Nuevo costo de produccion: ");
                                nuevoCP = tcld.nextDouble();
                                cP.Cambios(nombre, null, 4, 0, nuevoCP);
                                break;
                        }

                    } while (opcionMod != 5);
                    break;

                case 5:
                    System.out.println(cP.Reporte());
                    break;

                case 6:
                    System.out.print("Nombre del producto: ");
                    nombre = tcld.next();
                    System.out.println(cP.CalcularPrecioVenta(nombre));
                    break;

            }
            lines();
        } while (opcion != 7);
        
    }

}