package EXCEPCIONES;

public class TestPersona {
    public static void main(String[] args) {
        Persona arreglo[] = new Persona[3];
        arreglo[0] = new Persona("Julian", 18, 78);
        arreglo[1] = new Persona("Ricardo", 20, 64);
        arreglo[2] = new Persona("Vicente", 18, 60);
        arreglo[1] = null;

        try {
            for(int i=0; i<arreglo.length; i++){
                System.out.println(arreglo[i].toString());
            }
        } catch (NullPointerException e) {
           System.out.println(e.getMessage());
        }
    }

}
