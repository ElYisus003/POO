package Unidad3.Futbol;

public class Portero extends Jugador{

    public Portero(String nombre, String posicion, int numeroUninforme, int minutosJugados) {
        super(nombre, posicion, numeroUninforme, minutosJugados);
    }

    @Override
    public String toString() {
        return "Portero [nombre=" + getNombre() + ", posicion=" + getPosicion() + ", numeroUninforme=" + getNumeroUninforme()
                + ", minutosJugados=" + getMinutosJugados() + "]";
    }

}
