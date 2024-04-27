package Unidad3.Restaurante;

import java.util.Scanner;

public class TestAlimentos {

    public static void lines() {
        System.out.println("\n------------------------------------------------\n");
    }

    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        String nombre;
        float precio;
        int opcion, nAlimentos, cont=0;
        boolean popote, pollo, sal, tenedor, cuchillo, cuchara, azucar, carne;
        Alimento ArrayAlimentos[];
        Bebida bebidas;
        Ensalada ensaladas;
        platilloFuerte platillos;
        Postre postres;
        Sopa sopas;

        System.out.println("¿Cuantos alimentos deseas registrar?");
        nAlimentos = tcld.nextInt();
        ArrayAlimentos = new Alimento[nAlimentos];


        do {
            System.out.println("\n==================================");
            System.out.println("| [1] Bebida                     |");
            System.out.println("| [2] Ensalada                   |");
            System.out.println("| [3] Platillo Fuerte            |");
            System.out.println("| [4] Postre                     |");
            System.out.println("| [5] Sopa                       |");
            System.out.println("| [6] Mostrar alimentos          |");
            System.out.println("| [7] Salir                      |");
            System.out.println("==================================");
            opcion = tcld.nextInt();

            if (cont <= nAlimentos) {
                
                switch (opcion) {
                    case 1:
                    System.out.print("Nombre de la bebida: ");
                    nombre = tcld.next();
                    System.out.print("Precio de la bebida: ");
                    precio = tcld.nextFloat();
                    System.out.println("¿Con popote? (true/false)");
                    popote = tcld.nextBoolean();
                    System.out.println("¿Con azucar? (true/false)");
                    azucar = tcld.nextBoolean();

                    bebidas = new Bebida(nombre, precio, popote);
                    ArrayAlimentos[cont] = bebidas;
                    cont++;
                        break;
                
                    case 2:
                    System.out.print("Nombre de la ensalada: ");
                    nombre = tcld.next();
                    System.out.print("Precio de la ensalada: ");
                    precio = tcld.nextFloat();
                    System.out.println("¿Con pollo? (true/false)");
                    pollo = tcld.nextBoolean();
                    System.out.println("¿Con sal? (true/false)");
                    sal = tcld.nextBoolean();
                    System.out.println("¿Con tenedor? (true/false)");
                    tenedor = tcld.nextBoolean();
                    System.out.println("¿Con cuchillo? (true/false)");
                    cuchillo = tcld.nextBoolean();

                    ensaladas = new Ensalada(nombre, precio, pollo, sal, tenedor, cuchillo);
                    ArrayAlimentos[cont] = ensaladas;
                    cont++;
                        break;

                    case 3:
                    System.out.print("Nombre del platillo fuerte: ");
                    nombre = tcld.next();
                    System.out.print("Precio del platillo fuerte: ");
                    precio = tcld.nextFloat();
                    System.out.println("¿Con carne? (true/false)");
                    carne = tcld.nextBoolean();
                    System.out.println("¿Con pollo? (true/false)");
                    pollo = tcld.nextBoolean();
                    System.out.println("¿Con sal? (true/false)");
                    sal = tcld.nextBoolean();
                    System.out.println("¿Con tenedor? (true/false)");
                    tenedor = tcld.nextBoolean();
                    System.out.println("¿Con cuchillo? (true/false)");
                    cuchillo = tcld.nextBoolean();

                    platillos = new platilloFuerte(nombre, precio, carne, pollo, sal, tenedor, cuchillo);
                    ArrayAlimentos[cont] = platillos;
                    cont++;
                        break;

                    case 4:
                    System.out.print("Nombre del postre: ");
                    nombre = tcld.next();
                    System.out.print("Precio del postre: ");
                    precio = tcld.nextFloat();
                    System.out.println("¿Con azucar? (true/false)");
                    azucar = tcld.nextBoolean();
                    System.out.println("¿Con cuchara? (true/false)");
                    cuchara = tcld.nextBoolean();
                    if (cuchara) tenedor = false;
                    else tenedor = true;

                    postres = new Postre(nombre, precio, cuchara, tenedor, azucar);
                    ArrayAlimentos[cont] = postres;
                    cont++;
                        break;
                    
                    case 5:
                    System.out.print("Nombre de la sopa: ");
                    nombre = tcld.next();
                    System.out.print("Precio de la sopa: ");
                    precio = tcld.nextFloat();
                    System.out.println("¿Con pollo? (true/false)");
                    pollo = tcld.nextBoolean();
                    System.out.println("¿Con sal? (true/false)");
                    sal = tcld.nextBoolean();

                    sopas = new Sopa(nombre, precio, pollo, sal);
                    ArrayAlimentos[cont] = sopas;
                    cont++;
                        break;

                    case 6:
                    for (int i = 0; i < cont; i++) {
                        System.out.println(ArrayAlimentos[i]);
                        lines();
                    }
                        break;

                    case 7:
                    System.out.println("Saliendo...");
                        break;
                    
                    default:
                        break;
                }

            } else {
                System.out.println("Ya no puedes registrar más alimentos");
            }

            lines();
            
        } while (opcion != 7);


    }


}
