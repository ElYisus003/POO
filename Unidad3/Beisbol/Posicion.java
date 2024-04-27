package Unidad3.Beisbol;

public class Posicion extends Jugadores{
   private int hits, numeroErrores;

    public Posicion(String nombre, String posicion, int numeroUniforme, int hits, int numeroErrores) {
         super(nombre, posicion, numeroUniforme);
         this.hits = hits;
         this.numeroErrores = numeroErrores;
    }

    public int getHits() { return hits; }
    public void setHits(int hits) { this.hits = hits; }

    public int getNumeroErrores() { return numeroErrores; }
    public void setNumeroErrores(int numeroErrores) { this.numeroErrores = numeroErrores; }

    @Override
    public String toString() {
        return "Posicion [nombre=" + getNombre() + ", posicion=" + getPosicion() + ", numeroUniforme=" + getNumeroUniforme() + ", hits=" + hits + 
        ", numeroErrores=" + numeroErrores + "]";
    }

}
