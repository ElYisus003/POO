package ARCHIVOS;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SeriarAlumno {
    private static ObjectOutputStream oos;
    private static ObjectInputStream ois;
    private static Scanner tcld = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        int opcion = 0;
        abrirArchivo();
        abrirArchivoLectura();
        
        do {
            System.out.println("=====================================");
            System.out.println("| [1] Escribir en el archivo        |");
            System.out.println("| [2] Leer del archivo              |");
            System.out.println("| [3] Salir                         |");
            System.out.println("=====================================");
            opcion = tcld.nextInt();

            switch (opcion) {
                case 1:
                    escribirEnArchivo();
                    break;

                case 2:
                    leerAlumnos();
                    break;

                case 3:
                    cerrarArchivo();
                    cerrarFlujoLectura();
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }

            lines();

        } while (opcion != 3);
    }

    public static void abrirArchivoLectura() throws FileNotFoundException, IOException {
        ois = new ObjectInputStream(new FileInputStream("Alumnos.dat"));
    }

    public static void leerAlumnos() throws ClassNotFoundException, IOException {
        Alumno alumno;

        try {
            while(true) {
            alumno = (Alumno) ois.readObject();
            System.out.println(alumno.toString());
            }
        } catch (EOFException e) {
            return;
        }
    }

    public static void cerrarFlujoLectura() throws IOException {
        if (ois != null) {
            ois.close();
        }
    }

    public static void  abrirArchivo() throws FileNotFoundException, IOException {
        oos = new ObjectOutputStream(new FileOutputStream("Alumnos.dat"));
    }

    public static void escribirEnArchivo() throws IOException {
        String nombre, apellidoPaterno;
        double promedio;
        Alumno alumno;

        System.out.print("Escribe el nombre del alumno: ");
        nombre = tcld.next();
        System.out.print("Escribe el apellido paterno del alumno: ");
        apellidoPaterno = tcld.next();
        System.out.print("Escribe el promedio del alumno: ");
        promedio = tcld.nextDouble();

        alumno = new Alumno(nombre, apellidoPaterno, promedio);
        oos.writeObject(alumno);
        
    }

    public static void cerrarArchivo() throws IOException {
        if (oos != null) {
            oos.close();
        }
    }

    public static void lines() {
        System.out.println("\n=====================================\n");
    }

}
