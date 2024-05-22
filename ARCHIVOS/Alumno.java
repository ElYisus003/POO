package ARCHIVOS;

import java.io.Serializable;

public class Alumno implements Serializable{
    private String nombre, apellidoPaterno;
    private double promedio;

    public Alumno(String nombre, String apellidoPaterno, double promedio) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.promedio = promedio;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidoPaterno() { return apellidoPaterno; }
    public void setApellidoPaterno(String apellidoPaterno) { this.apellidoPaterno = apellidoPaterno; }

    public double getPromedio() { return promedio; }
    public void setPromedio(double promedio) { this.promedio = promedio; }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", promedio=" + promedio + '}';
    }    

}
