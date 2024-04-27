package Persona;

public class ControlPersona {
    private Persona ArrayPersona[];
    private int con = 0, max;

    public ControlPersona(int cantidad) {
        ArrayPersona = new Persona[cantidad];
        max = ArrayPersona.length;
    }

    public void AltasPersona(String nombre, String apellido, int edad, char genero, String direccion, String correo, String fechaNacimiento) {
        if (con <= (max-1)) {
            ArrayPersona[con] = new Persona(nombre, apellido, edad, genero, direccion, correo, fechaNacimiento);
            con++;
        } else {

            System.out.println("No hay espacio para agregar más personas");
        }
    }
    
    public String ReporteGeneralPersona() {
        String reporte = "";
        for (int i = 0; i < con; i++) {
            reporte += ArrayPersona[i].toString() + "\n";
        }
        return reporte;
    }

    public String BuscarPersona(String nombre) {
        String reporte = "";
        for (int i = 0; i < con; i++) {
            if (ArrayPersona[i].getNombre().equals(nombre)) {
                reporte = ArrayPersona[i].toString();
            } else {
                reporte = "\n" + "No se encontro la persona";
            }
        }
        return reporte;
    }

    public String BajaPersona(String nombre) {
        String reporte = "";
        for (int i = 0; i < con; i++) {
            if (ArrayPersona[i].getNombre().equals(nombre)) {
                reporte = ArrayPersona[i].toString();
                ArrayPersona[i] = ArrayPersona[con - 1];
                con--;
            }
        }
        return reporte;
    }
}
