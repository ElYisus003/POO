package Unidad3.AgenciaAutos;

public class Vagonetas extends Autos{
    private int capacidadPasajeros;

    public Vagonetas(String marca, String numeroSerie, int año, float precio, int capacidadPasajeros) {
        super(marca, numeroSerie, año, precio);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getCapacidadPasajeros() { return capacidadPasajeros; }
    public void setCapacidadPasajeros(int capacidadPasajeros) { this.capacidadPasajeros = capacidadPasajeros; }

	@Override
	public String toString() {
		return "Vagonetas [marca=" + getMarca() + ", numeroSerie=" + getNumeroSerie() + ", año=" + getAño() + ", precio=" + getPrecio() + 
        ", capacidadPasajeros=" + capacidadPasajeros + "]";
	}

}
