package Unidad3.Beisbol;

public class Bateadores extends Jugadores{
    private int hits;

    public Bateadores(String nombre, String posicion, int numeroUniforme, int hits) {
        super(nombre, posicion, numeroUniforme);
        this.hits = hits;
    }

    public int getHits() { return hits; }
    public void setHits(int hits) { this.hits = hits; }

    @Override
    public String toString() {
        return "Posicion [nombre=" + getNombre() + ", posicion=" + getPosicion() + ", numeroUniforme=" + getNumeroUniforme() + ", hits=" + hits + "]";
    }

}
