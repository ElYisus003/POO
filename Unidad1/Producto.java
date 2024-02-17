package Unidad1;

public class Producto {
	
	private String nombre;
	private int codigo;
	private float precio;
	private byte existencia;
	private String categoria;
	
	public Producto(String nombre, int codigo, float precio, byte existencia, String categoria) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.existencia = existencia;
		this.categoria = categoria;
	}
	
	public void setNombre (String nombre) { this.nombre = nombre; }
	public void setCodigo (int codigo) { this.codigo = codigo; }
	public void setPrecio (float precio) { this.precio = precio; }
	public void setExistencia (byte existencia) { this.existencia = existencia; }
	public void setCategoria (String categoria) { this.categoria = categoria; }
	
	public String getNombre() { return nombre; }
	public int getCodigo() { return codigo; }
	public float getPrecio() { return precio; }
	public byte getExistencia() { return existencia; }
	public String getCategoria() { return categoria; }
	
	public String mostrarAtributos () {
		String cadena = "";
		
		cadena = "Nombre: "+nombre+
				"\n"+"Código: "+codigo+
				"\n"+"Precio: "+precio+
				"\n"+"Existencias: "+existencia+
				"\n"+"Categoría: "+categoria;
		
		return cadena;
	}
}
