package ARCHIVOS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class LeerYEscribirBytes {
	//Menu
	/*
	 * [1] Escribir en el archivo
	 * [2] Leer del archivo
	 * [3] Salir
	 */

	public static void lines(){
		System.out.println("\n=====================================\n");
	}

	public static void main(String[] args) {
		Scanner tcld = new Scanner(System.in);
		FileOutputStream fos = null;
		FileInputStream fis = null;
		byte[] buffer = new byte[81];
		int nbytes, opcion;

		do {
			System.out.println("=============== MENÚ ================");
			System.out.println("| [1] Escribir en el archivo        |");
			System.out.println("| [2] Leer del archivo              |");
			System.out.println("| [3] Salir                         |");
			System.out.println("=====================================");
			System.out.print("Seleccione una opcion: ");
			opcion = tcld.nextInt();

			switch (opcion) {
				case 1:
					System.out.println("Introduzca el texto que desea guardar: ");
					try {
						nbytes = System.in.read(buffer);
						fos = new FileOutputStream("Texto2.txt", true);
						fos.write(buffer, 0, nbytes);
					} catch (Exception e) {
						System.out.println("Error: " + e.toString());
					} finally {
						try {
							fos.close();
						} catch (Exception e) {
							System.out.println("Error: " + e.toString());
						}
					}
					break;

				case 2:
					try {
						fis = new FileInputStream("Texto2.txt");
						nbytes = fis.read(buffer, 0, 81);
						String str = new String(buffer, 0, nbytes);
						System.out.println(str);
					} catch (Exception e) {
						System.out.println("Error: " + e.toString());
					} finally {
						try {
							fis.close();
						} catch (Exception e) {
							System.out.println("Error: " + e.toString());
						}
					}
					break;

				case 3:
					System.out.println("Saliendo...");
					break;

				default:
					System.out.println("Opcion no valida.");
					break;
			}
			lines();
		} while (opcion != 3);
	}

}
