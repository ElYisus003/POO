package Unidad3.AgenciaAutos;

public class AutosCompactos extends Autos{
    private int capacidadPasajeros;
public AutosCompactos(String marca, String numeroSerie, int año, float precio, int capacidadPasajeros) {
        super(marca, numeroSerie, año, precio);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getCapacidadPasajeros() { return capacidadPasajeros; }
    public void setCapacidadPasajeros(int capacidadPasajeros) { this.capacidadPasajeros = capacidadPasajeros; }

	@Override
	public String toString() {
        return "AutosCompactos [marca=" + getMarca() + ", numeroSerie=" + getNumeroSerie() + ", año=" + getAño() + ", precio=" + getPrecio() + 
        ", capacidadPasajeros=" + capacidadPasajeros + "]";
    }


}
