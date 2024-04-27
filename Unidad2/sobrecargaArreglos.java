package Unidad2;

public class sobrecargaArreglos {

    public static void imprimir(int arreglo[]) {
        for (int numero: arreglo) {
            System.out.println(numero);
        }
    }

    public static void imprimir(char caracteres[]) {
        for (char c: caracteres) {
            System.out.println(c);
        }
    }

    public static void imprimir(String arreglo[]) {
        for (String n: arreglo) {
            System.out.println(n);
        }
    }

    public static void lines() {
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        String nombres[] = {"Jesús", "Alejandro", "Levi", "Karol", "Aarón", "Santiago",
                            "Enoc", "Valeria"};
    
        int calificaciones[] = {90, 80, 98, 95, 70, 60, 77, 66};
        char vocales[] = {'a', 'e', 'i', 'o', 'u'};
        
        lines();
        imprimir(nombres);
        lines();
        imprimir(vocales);
        lines();
        imprimir(calificaciones);
        lines();

    }

}
