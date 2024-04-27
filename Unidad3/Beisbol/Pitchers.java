package Unidad3.Beisbol;

public class Pitchers extends Jugadores{
    private int ponches, numeroErrores;

    public Pitchers(String nombre, String posicion, int numeroUniforme, int ponches, int numeroErrores) {
        super(nombre, posicion, numeroUniforme);
        this.ponches = ponches;
        this.numeroErrores = numeroErrores;
    }

    public int getPonches() { return ponches; }
    public void setPonches(int ponches) { this.ponches = ponches; }

    public int getNumeroErrores() { return numeroErrores; }
    public void setNumeroErrores(int numeroErrores) { this.numeroErrores = numeroErrores; }

    @Override
    public String toString() {
        return "Pitchers [nombre=" + getNombre() + ", posicion=" + getPosicion() + ", numeroUniforme=" + getNumeroUniforme() + ", ponches=" + ponches + 
        ", numeroErrores=" + numeroErrores + "]";
    }

}
