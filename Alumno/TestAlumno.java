package Alumno;

import java.util.Scanner;

public class TestAlumno {

    public static void lines() {
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        int opcion, cantidadA, promedio, contador=0;
        String nombre, apellido, carrera;
        char genero;
        byte semestre;
        
        System.out.print("Ingrese la cantidad de alumnos a registrar: ");
        cantidadA = tcld.nextInt();
        ControlAlumno cA = new ControlAlumno(cantidadA);
        System.out.println();

        do {
            System.out.println("================================================");
            System.out.println("| [1] Altas alumno                             |");
            System.out.println("| [2] Buscar alumno                            |");
            System.out.println("| [3] Reporte general de alumnos               |");
            System.out.println("| [4] Reporte de alumnos de excelencia         |");
            System.out.println("| [5] Reporte de alumnos de segundo semestre   |");
            System.out.println("| [6] Reporte de mujeres                       |");
            System.out.println("| [7] Salir                                    |");
            System.out.println("================================================");
            opcion = tcld.nextInt();

            switch (opcion) {
                case 1:
                    if(contador < cantidadA) {
                    	System.out.print("Nombre: ");
                        nombre = tcld.next();
                        System.out.print("Apellido: ");
                        apellido = tcld.next();
                        System.out.print("Carrera: ");
                        carrera = tcld.next();
                        System.out.print("Genero: ");
                        genero = tcld.next().charAt(0);
                        System.out.print("Semestre: ");
                        semestre = tcld.nextByte();
                        System.out.print("Promedio: ");
                        promedio = tcld.nextInt();

                        cA.AltasAlumno(nombre, apellido, carrera, genero, semestre, promedio);
                        
                    } else {
                    	System.out.println("No hay espacio para agregar más personas");
                    }

                    break;

                case 2:
                    System.out.print("Ingrese el nombre del alumno a buscar: ");
                    nombre = tcld.next();
                    System.out.println(cA.BuscarAlumno(nombre));
                    break;

                case 3:
                    System.out.println(cA.ReporteGeneralAlumnos());
                    break;

                case 4:
                    System.out.println(cA.ReporteAlumnosExcelencia());
                    break;

                case 5:
                    System.out.println(cA.ReporteAlumnosSegundo());
                    break;

                case 6:
                    System.out.println(cA.ReporteMujeres());
                    break;
            
                default:
                    System.out.println("Opcion invalida, intente de nuevo.");
                    break;
            }

            lines();

        } while (opcion != 7);
        
        
    }

}
