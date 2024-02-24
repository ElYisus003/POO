package Unidad2;

public class test_funciones {

	public static void lines() {
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();
	}
	public static void main(String[] args) {
		Funciones funcion1 = new Funciones(5, 3);

		System.out.println(funcion1.Factorial());
		lines();
		System.out.println(funcion1.Fibonacci());
		lines();
		System.out.println(funcion1.Potencia());
		lines();
		System.out.println(funcion1.toString());
	}

}
