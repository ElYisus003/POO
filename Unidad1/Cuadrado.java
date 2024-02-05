package Unidad1;

public class Cuadrado {

	private String nombre;
	private float lado;
	
	//CONSTRUCTOR
	public Cuadrado (String nombre, float lado){
		this.nombre = nombre;
		this.lado = lado;
	}
	
	//MÉTODOS SET
	public void setNombre(String nombre) { this.nombre = nombre; }
	public void setLado(float lado) { this.lado = lado; }
	
	//MÉTIDOS GET
	public String getNombre() { return nombre; }
	public float getLado() { return lado; }
	
	//MÉTODO CALCULAR ÁREA
	public float calcularArea(){
		float area;
		
		area = (float) (Math.pow(lado, 2));

		return area;
	}
	
	//MÉTODO CALCULAR PERIMETRO
	public float calcularPerimetro(){
		float perimetro;

		perimetro = lado*4;

		return perimetro;
	}
	
	//MÉTODO MOSTRAR EL VALOR DE TODOS LOS ATRIBUTOS
	public String mostrarValores(){
		String valores;

		valores = "El nombre del cuadrado es: "+nombre+
				  "\n"+"El tamaño del lado es: "+lado+
				  "\n"+"El área del cuadrado es: "+calcularArea()+
				  "\n"+"El perimetro del cuadrado es: "+calcularPerimetro();

		return valores;
	}

}
