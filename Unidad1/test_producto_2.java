package Unidad1;

import java.util.Scanner;

public class test_producto_2 {

	static Scanner MarcoAntonioSolis = new Scanner(System.in);

	public static void lines(){
		System.out.println("");
		System.out.println("-------------------------------------------------");
		System.out.println("");
	}
	public static void main(String []args) {
		Producto arreglo[] = new Producto[20];
		Producto producto;
		int contador = 0;
		String nom, cat;
		float pre;
		byte exis;
		int cod, opcion=0;

		do {
			System.out.println("-----------------MENU-----------------");
			System.out.println("| 1.- Agregar producto               |");
			System.out.println("| 2.- Mostrar productos              |");
			System.out.println("| 3.- Salir                          |");
			System.out.println("--------------------------------------");
			opcion = MarcoAntonioSolis.nextInt();

			switch(opcion) {
				case 1:
					System.out.println("Ingrese el nombre del producto: ");
					nom = MarcoAntonioSolis.next();
					System.out.println("Ingrese el codigo del producto: ");
					cod = MarcoAntonioSolis.nextInt();
					System.out.println("Ingrese el precio del producto: ");
					pre = MarcoAntonioSolis.nextFloat();
					System.out.println("Ingrese la existencia del producto: ");
					exis = MarcoAntonioSolis.nextByte();
					System.out.println("Ingrese la categoria del producto: ");
					cat = MarcoAntonioSolis.next();
					lines();

					producto = new Producto(nom, cod, pre, exis, cat);
					arreglo[contador] = producto;
					contador++;
					break;

				case 2:
					for(int i=0; i<contador; i++) {
						System.out.println(arreglo[i].mostrarAtributos());
						lines();
					}
					break;
				
				case 3:
					System.out.println("Saliendo...");
					break;

				default:
					System.out.println("Opcion no valida");
					break;
			}

		}while(opcion!=3);
	}

}
