package Unidad3.Futbol;

public class Jugador {
    private String nombre, posicion;
    private int numeroUninforme, minutosJugados;

    public Jugador(String nombre, String posicion, int numeroUninforme, int minutosJugados) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.numeroUninforme = numeroUninforme;
        this.minutosJugados = minutosJugados;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPosicion() { return posicion; }
    public void setPosicion(String posicion) { this.posicion = posicion; }

    public int getNumeroUninforme() { return numeroUninforme; }
    public void setNumeroUninforme(int numeroUninforme) { this.numeroUninforme = numeroUninforme; }

    public int getMinutosJugados() { return minutosJugados; }
    public void setMinutosJugados(int minutosJugados) { this.minutosJugados = minutosJugados; }

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", numeroUninforme=" + numeroUninforme
				+ ", minutosJugados=" + minutosJugados + "]";
	}
        
}
