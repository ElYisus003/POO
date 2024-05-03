package EXCEPCIONES;

public class Persona {
    private String nombre;
    private int edad;
    private float peso;

    public Persona(String nombre, int edad, float peso) {
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
    }

	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	public int getEdad() { return edad; }
	public void setEdad(int edad) {	this.edad = edad; }

	public float getPeso() { return peso; }
	public void setPeso(float peso) { this.peso = peso; }

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
	}

}
