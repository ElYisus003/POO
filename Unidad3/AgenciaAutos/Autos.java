package Unidad3.AgenciaAutos;

public class Autos {
    private String marca, numeroSerie;
    private int año;
    private float precio;

    public Autos(String marca, String numeroSerie, int año, float precio) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.año = año;
        this.precio = precio;
    }

    public String getMarca() { return marca; }
    public String getNumeroSerie() { return numeroSerie; }

    public int getAño() { return año; }
    public void setAño(int año) { this.año = año; }

    public float getPrecio() { return precio; }
    public void setPrecio(float precio) { this.precio = precio; }

	@Override
	public String toString() {
		return "Autos [marca=" + marca + ", numeroSerie=" + numeroSerie + ", año=" + año + ", precio=" + precio + "]";
	}

}
