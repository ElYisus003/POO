package Unidad1;

public class test_cuadrado {

    public static void lines(){
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado("Cuadradin", 5);
        Cuadrado cuadrado2 = new Cuadrado("El Picudo Cuadrático", 10);

        cuadrado1.setLado(5);
        System.out.println(cuadrado1.mostrarValores());

        lines();
        
        cuadrado2.setLado(10);
        System.out.println(cuadrado2.mostrarValores());
    }

}
