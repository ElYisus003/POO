package Unidad2;

public class test_circunferencia {
    public static void main(String[] args) {
        double radio;
        Circunferencia Rueda = new Circunferencia();
        Circunferencia Moneda = new Circunferencia();

        //INICIALIZAR EL RADIO DEL OBJETO RUEDA Y MONEDA
        Rueda.modificarRadio(10.2);
        Moneda.modificarRadio(1.4);

        System.out.println();

        //IMPRIMIR EL RADIO DEL OBJETO RUEDA Y MONEDA
        System.out.println("El radio de la rueda es: " + Rueda.consultarRadio());
        System.out.println("El radio de la moneda es: " + Moneda.consultarRadio());

        System.out.println();

        //IMPRIMIR EL AREA DEL OBJETO RUEDA Y MONEDA
        System.out.println("El area de la rueda es: " + Rueda.calcularArea());
        System.out.println("El area de la moneda es: " + Moneda.calcularArea());

        System.out.println();

        //IMPRIMIR EL PERIMETRO DEL OBJETO RUEDA Y MONEDA
        System.out.println("El perimetro de la rueda es: " + Rueda.calcularPerimetro());
        System.out.println("El perimetro de la moneda es: " + Moneda.calcularPerimetro());
        
        
    }

}
