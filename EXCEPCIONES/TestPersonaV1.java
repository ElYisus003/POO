package EXCEPCIONES;

public class TestPersonaV1 {
    public static void main(String[] args) {
        Persona arreglo[] = new Persona[3];
        arreglo[0] = new Persona("Julian", 18, 78);
        arreglo[1] = new Persona("Ricardo", 20, 64);
        arreglo[2] = new Persona("Vicente", 18, 60);
        arreglo[1] = null;

        for(int i=0; i<arreglo.length; i++){
            try {
                System.out.println(arreglo[i].toString());    
            } catch (NullPointerException e) {
               System.out.println(e.getMessage());
            }
        }

    }
        
}
