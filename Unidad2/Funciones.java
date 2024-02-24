package Unidad2;

public class Funciones {

	private int numero, exp;

	public Funciones(int numero, int exp) {
		this.numero = numero;
		this.exp = exp;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Funciones [numero=" + numero + ", exp=" + exp + "]";
	}

	public int Potencia() {
		int resultado = 1;

		for (int i = 1; i <= exp; i++) {
			resultado *= numero;
		}

		return resultado;
	}

	public int Factorial() {
		int resultado = 1;

		for (int i = numero; i > 0; i--) {
			resultado *= i;
		}

		return resultado;
	}

	public String Fibonacci() {
		int ultimo=1, penultimo=0, serie;
		String cadena = "";

		for(int i = 1; i <= numero; i++) {
			serie = ultimo + penultimo;
			cadena += serie + " , ";
			penultimo = ultimo;
			ultimo = serie;
		}

		return cadena;
	}


}
