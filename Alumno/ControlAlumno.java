package Alumno;

public class ControlAlumno {
    private Alumno array[];
    private int max;
    private int cont = 0;
    
    public ControlAlumno(int cantidad) {
        array = new Alumno[cantidad];
        max = array.length;
    }

    public void AltasAlumno(String nombre, String apellido, String carrera, char genero, byte semestre, int promedio) {
        if (cont < max) {
            array[cont] = new Alumno(nombre, apellido, carrera, genero, semestre, promedio);
            cont++;
        } else {
            System.out.println("No hay espacio para más alumnos");
        }
    }

    public String ReporteGeneralAlumnos() {
        String reporte = "";
        for (int i = 0; i < cont; i++) {
            reporte += array[i].toString() + "\n";
        }
        return reporte;
    }

    public String ReporteAlumnosExcelencia() {
        String reporte = "";
        for (int i = 0; i < cont; i++) {
            if (array[i].getPromedio() >= 90) {
                reporte += array[i].toString() + "\n";
            }
        }
        return reporte;
    }

    public String ReporteAlumnosSegundo() {
        String reporte = "";
        for (int i = 0; i < cont; i++) {
            if (array[i].getSemestre() == 2) {
                reporte += array[i].toString() + "\n";
            }
        }
        return reporte;
    }

    public String ReporteMujeres() {
        String reporte = "";
        for (int i = 0; i < cont; i++) {
            if (array[i].getGenero() == 'F') {
                reporte += array[i].toString() + "\n";
            }
        }
        return reporte;
    }

    public String BuscarAlumno(String nombre) {
        String reporte = "";
        for (int i = 0; i < cont; i++) {
            if (array[i].getNombre().equals(nombre)) {
                reporte += array[i].toString() + "\n";
            }
        }
        return reporte;
    }

}
