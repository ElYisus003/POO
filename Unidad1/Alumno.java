package Unidad1;

public class Alumno {
	
	private String nombre;
	private String apellidoP;
	private int numeroControl;
	private int cal1, cal2, cal3, cal4, cal5, cal6;
	
	public Alumno(String nombre, String apellidoP, int numeroControl) {
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.numeroControl = numeroControl;
	}
	
	public void setCal1(int cal1) { this.cal1 = cal1; }
	public void setCal2(int cal2) {	this.cal2 = cal2; }
	public void setCal3(int cal3) {	this.cal3 = cal3; }
	public void setCal4(int cal4) {	this.cal4 = cal4; }
	public void setCal5(int cal5) {	this.cal5 = cal5; }
	public void setCal6(int cal6) {	this.cal6 = cal6; }
	
	public void setNombre(String nombre) {	this.nombre = nombre; }
	public void setApellidoP(String apellidoP) { this.apellidoP = apellidoP; }
	public void setNumeroControl(int numeroControl) { this.numeroControl = numeroControl; }
	
	public int getCal1() {return cal1;}
	public int getCal2() {return cal2;}
	public int getCal3() {return cal3;}
	public int getCal4() {return cal4;}
	public int getCal5() {return cal5;}
	public int getCal6() {return cal6;}
	
	public String getNombre() {return nombre;}
	public String getApellidoP() {return apellidoP;}
	public int getNumeroControl() {return numeroControl;}
	
	public String mostrarAtributos() {
		String cadena = "";
		cadena = "El nombre es: "+nombre+
				"\nSu apellido es: "+apellidoP+
				"\nCon número de control: "+numeroControl+
				"\nCalificación 1: "+cal1+
				"\nCalificación 2: "+cal2+
				"\nCalificación 3: "+cal3+
				"\nCalificación 4: "+cal4+
				"\nCalificación 5: "+cal5+
				"\nCalificación 6: "+cal6;
		
		return cadena;
	}
	
	public int calcularPromedio() {
		int promedio;
		
		promedio = (cal1 + cal2 + cal3 + cal4 + cal5 + cal6)/6;
		
		return promedio;
	}
	
	public String calAlta() {
		String cal="";
		
		if(cal1>cal2 && cal1>cal3 && cal1>cal4 && cal1>cal5 && cal1>cal6) cal = "Unidad 1";
		else if(cal2>cal1 && cal2>cal3 && cal2>cal4 && cal2>cal5 && cal2>cal6) cal = "Unidad 2";
		else if(cal3>cal2 && cal3>cal1 && cal3>cal4 && cal3>cal5 && cal3>cal6) cal = "Unidad 3";
		else if(cal4>cal2 && cal4>cal3 && cal4>cal1 && cal4>cal5 && cal4>cal6) cal = "Unidad 4";
		else if(cal5>cal2 && cal5>cal3 && cal5>cal4 && cal5>cal1 && cal5>cal6) cal = "Unidad 5";
		else if(cal6>cal2 && cal6>cal3 && cal6>cal4 && cal6>cal5 && cal6>cal1) cal = "Unidad 6";
		
		return cal;
	}

}
