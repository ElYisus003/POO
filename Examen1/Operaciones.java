package Examen1;

public class Operaciones {
	private int numero1, numero2;
	
	//CONSTRUCTOR
	public Operaciones(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	//MÉTODOS SET
	public void setNumero1(int numero1) { this.numero1 = numero1; }
	public void setNumero2(int numero2) { this.numero2 = numero2; }

	//MÉTODOS GET
	public int getNumero1() { return numero1; }
	public int getNumero2() { return numero2; }
	
	//DETERMINAR SI EL NUMERO1 ES MÚTLIPLO DE 5
	public String determinarMultiplo5() {
		String respuesta;
		
		if(numero1 % 5 == 0) {
			respuesta = "El numero "+numero1+" es múltiplo de 5";
		}
		else {
			respuesta = "El número "+numero1+" no es múltiplo de 5";
		}
		
		return respuesta;
	}
	
	//MÉTODO QUE DIVIDA NÚMERO1 ENTRE NÚMERO2
	public float divisionDeLosNumeros() {
		float resultado;
		
		resultado = numero1 / numero2;
		
		return resultado;
	}
	
	//MÉTODO PARA DETERMINAR SI EL NÚMERO2 ES NEGATIVO
	public String determinarNegativo() {
		String respuesta;
		
		if(numero2 < 0) respuesta = "El número "+numero2+" es negativo";
		else respuesta = "El número "+numero2+" no es negativo";
		
		return respuesta;
	}
	
	//MOSTRAR ATRIBUTOS
	public String mostrarAtributos() {
		String atributos;
		
		atributos = "El numero 1 es:"+numero1+
				"\n"+"El número 2 es:"+numero2+
				"\n"+determinarMultiplo5()+
				"\n"+"La el resultado de la divisón "+numero1+" / "+numero2+" = "+divisionDeLosNumeros()+
				"\n"+determinarNegativo();
		
		return atributos;
	}
}
