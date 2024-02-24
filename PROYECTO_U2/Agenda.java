package PROYECTO_U2;

public class Agenda {
    private String nombre, apellidoP, apellidoM, correo, fechaNacimiento;
    private int telefono;
    private byte edad;
    
	public Agenda(String nombre, String apellidoP, String apellidoM, String correo, String fechaNacimiento,
			int telefono, byte edad) {
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.correo = correo;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
		this.edad = edad;
	}

	public String getNombre() {	return nombre; }
	public String getApellidoP() { return apellidoP; }
	public void setApellidoP(String apellidoP) { this.apellidoP = apellidoP;	}

	public String getApellidoM() { return apellidoM; }
	public void setApellidoM(String apellidoM) { this.apellidoM = apellidoM; }

	public String getCorreo() { return correo; }
	public void setCorreo(String correo) { this.correo = correo; }

	public String getFechaNacimiento() { return fechaNacimiento; }
	public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

	public int getTelefono() { return telefono; }
	public void setTelefono(int telefono) { this.telefono = telefono; }

	public byte getEdad() {	return edad; }
	public void setEdad(byte edad) { this.edad = edad; }

	@Override
	public String toString() {
		return "Agenda [nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", correo="
				+ correo + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", edad=" + edad + "]";
	}
    
	
}
