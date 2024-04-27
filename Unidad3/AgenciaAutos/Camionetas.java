package Unidad3.AgenciaAutos;

public class Camionetas extends Autos{
    private float capacidadCarga;
    private int ejes, rodadas;

   public Camionetas(String marca, String numeroSerie, int año, float precio, float capacidadCarga, int ejes, int rodadas) {
        super(marca, numeroSerie, año, precio);
        this.capacidadCarga = capacidadCarga;
        this.ejes = ejes;
        this.rodadas = rodadas;
    }

    public float getCapacidadCarga() { return capacidadCarga; }
    public void setCapacidadCarga(float capacidadCarga) { this.capacidadCarga = capacidadCarga; }

    public int getEjes() { return ejes; }
    public void setEjes(int ejes) { this.ejes = ejes; }

    public int getRodadas() { return rodadas; }
    public void setRodadas(int rodadas) { this.rodadas = rodadas; }

	@Override
	public String toString() {
		return "Camionetas [marca=" + getMarca() + ", numeroSerie=" + getNumeroSerie() + ", año=" + getAño() + ", precio=" + getPrecio() + 
        ", capacidadCarga=" + capacidadCarga + ", ejes=" + ejes + ", rodadas=" + rodadas + "]";
    }

}
