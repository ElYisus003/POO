package Unidad1;

public class test_alumno {
	
	public static void lines() {
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();
	}

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Juan", "Pérez", 23647895);
		Alumno alumno2 = new Alumno("Pedro", "Mendoza", 23640086);
		Alumno alumno3 = new Alumno("Jesús", "Gómez", 23640115);
		Alumno alumno4 = new Alumno("Karol", "Tafolla", 23640278);
		
		alumno1.setCal1(80);
		alumno1.setCal2(100);
		System.out.println(alumno1.mostrarAtributos());
		
		lines();
		
		alumno1.setNombre("Pancracio");
		alumno1.setCal3(100);
		System.out.println(alumno1.mostrarAtributos());
		System.out.println();
		System.out.println(alumno1.getNumeroControl());
		
		lines();
		
		System.out.println("El promedio del alumno 1 es: "+alumno1.calcularPromedio());
		System.out.println("\n"+"El promeido del alumno 2 es: "+alumno2.calcularPromedio());
		
		lines();
		
		System.out.println("La calificación más alta del alumno 1 es: "+alumno1.calAlta());
		System.out.println(alumno1.calAlta());
	}

}
