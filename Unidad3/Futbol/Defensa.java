package Unidad3.Futbol;

public class Defensa extends Jugador{
    private int numeroGoles;

    public Defensa(String nombre, String posicion, int numeroUninforme, int minutosJugados, int numeroGoles) {
        super(nombre, posicion, numeroUninforme, minutosJugados);
        this.numeroGoles = numeroGoles;
    }

    public int getNumeroGoles() { return numeroGoles; }
    public void setNumeroGoles(int numeroGoles) { this.numeroGoles = numeroGoles; }

    @Override
    public String toString() {
        return "Defensa [nombre=" + getNombre() + ", posicion=" + getPosicion() + ", numeroUninforme=" + getNumeroUninforme()
                + ", minutosJugados=" + getMinutosJugados() + ", numeroGoles=" + numeroGoles + "]";
    }
    
}
