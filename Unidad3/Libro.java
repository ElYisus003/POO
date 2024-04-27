package Unidad3;

public class Libro extends Publicacion{
    private int numeroPaginas;

    public Libro(String titulo, float precio, int numeroPaginas) {
        super(titulo, precio);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() { return numeroPaginas; }
    public void setNumeroPaginas(int numeroPaginas) { this.numeroPaginas = numeroPaginas; }

	@Override
	public String toString() {
		return "Libro [" + "titulo=" + super.getTitulo() + ", precio=" + super.getPrecio() + ", numeroPaginas=" + numeroPaginas + "]";
	}

}
