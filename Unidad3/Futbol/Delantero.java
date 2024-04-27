package Unidad3.Futbol;

public class Delantero extends Jugador{
    private int numeroGoles;

    public Delantero(String nombre, String posicion, int numeroUninforme, int minutosJugados, int numeroGoles) {
        super(nombre, posicion, numeroUninforme, minutosJugados);
        this.numeroGoles = numeroGoles;
    }

    public int getNumeroGoles() { return numeroGoles; }
    public void setNumeroGoles(int numeroGoles) { this.numeroGoles = numeroGoles; }

    @Override
    public String toString() {
        return "Delantero [nombre=" + getNombre() + ", posicion=" + getPosicion() + ", numeroUninforme=" + getNumeroUninforme()
                + ", minutosJugados=" + getMinutosJugados() + ", numeroGoles=" + numeroGoles + "]";
    }

}
