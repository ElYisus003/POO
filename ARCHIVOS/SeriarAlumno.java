package ARCHIVOS;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SeriarAlumno {
    private ObjectOutputStream oos;
    private static Scanner tcld = new Scanner(System.in);

    public void abrirArchivo() throws FileNotFoundException, IOException {
        oos = new ObjectOutputStream(new FileOutputStream("Alumnos.dat"));
    }

    public void EscribirEnArchivo() throws IOException {
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

    public void cerrarArchivo() throws IOException {
        if (oos != null) {
            oos.close();
        }
    }

}
