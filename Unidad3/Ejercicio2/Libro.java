package Unidad3.Ejercicio2;

public class Libro extends Publicacion{
    private int numeroPaginas;
    private float ventas;

    public Libro(String titulo, float precio, int numeroPaginas, float ventas) {
        super(titulo, precio);
        this.numeroPaginas = numeroPaginas;
        this.ventas = ventas;
    }

    public int getNumeroPaginas() { return numeroPaginas; }
    public void setNumeroPaginas(int numeroPaginas) { this.numeroPaginas = numeroPaginas; }

    public float getVentas() { return ventas; }
    public void setVentas(float ventas) { this.ventas = ventas; }

	@Override
	public String toString() {
		return "Libro [" + "titulo=" + super.getTitulo() + ", precio=" + super.getPrecio() + ", numeroPaginas=" + numeroPaginas + 
				", ventas=" + ventas + "]";
	}

}