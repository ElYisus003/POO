package Unidad3.Personas;

public class Persona {
    private String nombre, domicilio;

    public Persona(String nombre, String domicilio) {
        this.nombre = nombre;
        this.domicilio = domicilio;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDomicilio() { return domicilio; }
    public void setDomicilio(String domicilio) { this.domicilio = domicilio; }

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", domicilio=" + domicilio + "]";
	}

}
