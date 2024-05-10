package Examen_Unidad4y5;

public class sobrecargaArreglos {
	public static void imprimir(int arreglo[]){
	    for(int numero:arreglo){
	      System.out.println(numero);
	    }
	}
	public static void imprimir(char arreglo[]){
	    for(char c:arreglo){
	      System.out.println(c);
	    }
	}
	public static void imprimir(String  arreglo[]){
	    for(int i=0;i<arreglo.length+1;i++){
	    	try {
	    	System.out.println(arreglo[i]);
	    	} catch (ArrayIndexOutOfBoundsException e) {
	    		System.out.println("Error: Indice fuera de rango");
	    	}
	    }
	}
	public static void main(String args[]){
	String nombres[]={"Jésus", "Alejandro", null, "Carol", "Aaron",
	                  "Santiago", "Enoc","Valeria"};
	int calificaciones[]={90, 80, 90, 95,70,60,77,66};
	char vocales[]={'a','e','i','0','u'};
	imprimir(nombres);
	imprimir(vocales);
	imprimir(calificaciones);
	}
}
