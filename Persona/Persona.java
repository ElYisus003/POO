package Persona;

public class Persona {
    private String nombre, apellido, direccion, fechaNacimiento, correo;
    private int edad;
    private char genero;

    public Persona(String nombre, String apellido, int edad, char genero, String direccion, String correo, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        
        
    }

	public String getNombre() {	return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	public String getApellido() { return apellido; }
	public void setApellido(String apellido) { this.apellido = apellido; }

	public String getDireccion() { return direccion; }
	public void setDireccion(String direccion) { this.direccion = direccion; }

	public String getFechaNacimiento() { return fechaNacimiento; }
	public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

	public int getEdad() { return edad; }
	public void setEdad(int edad) { this.edad = edad; }

	public char getGenero() { return genero; }
	public void setGenero(char genero) { this.genero = genero; }

	public String getCorreo() { return correo; }
	public void setCorreo(String correo) { this.correo = correo; }

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + ", genero=" + genero + ", correo="
				+ correo + "]";
	}
	
	

}
