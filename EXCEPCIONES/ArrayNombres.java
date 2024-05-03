package EXCEPCIONES;

public class ArrayNombres {
    public static void main(String[] args) {
        String nombres[] = {"Marcia", "Vicente", "Luis", "Kike", "Jesús", "Santiago", "Bryan", "Levi", "Enoc", "Ricardo"};

        try {
            for(int i=0; i<nombres.length + 1; i++) {
                System.out.println(nombres[i] + "\n");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        }                    
        
        
    }

}
