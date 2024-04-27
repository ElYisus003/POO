package Unidad3.Beisbol;

public class Jugadores {
    private String nombre, posicion;
    private int numeroUniforme;

    public Jugadores(String nombre, String posicion, int numeroUniforme) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.numeroUniforme = numeroUniforme;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPosicion() { return posicion; }
    public void setPosicion(String posicion) { this.posicion = posicion; }

    public int getNumeroUniforme() { return numeroUniforme; }
    public void setNumeroUniforme(int numeroUniforme) { this.numeroUniforme = numeroUniforme; }

	@Override
	public String toString() {
		return "Jugadores [nombre=" + nombre + ", posicion=" + posicion + ", numeroUniforme=" + numeroUniforme + "]";
	}

}
