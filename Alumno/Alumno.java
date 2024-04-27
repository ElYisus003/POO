package Alumno;

public class Alumno {
    private String nombre, apellido, carrera;
    private char genero;
    private byte semestre;
    private int promedio;

    public Alumno(String nombre, String apellido, String carrera, char genero, byte semestre, int promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.genero = genero;
        this.semestre = semestre;
        this.promedio = promedio;
    }

	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	public String getApellido() { return apellido; }
	public void setApellido(String apellido) { this.apellido = apellido; }

	public String getCarrera() { return carrera; }
	public void setCarrera(String carrera) { this.carrera = carrera; }

	public char getGenero() { return genero; }
	public void setGenero(char genero) { this.genero = genero; }

	public byte getSemestre() {	return semestre; }
	public void setSemestre(byte semestre) { this.semestre = semestre; }

	public int getPromedio() { return promedio; }
	public void setPromedio(int promedio) { this.promedio = promedio; }



	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", carrera=" + carrera + ", genero=" + genero
				+ ", semestre=" + semestre + ", promedio=" + promedio + "]";
	}

    

}
