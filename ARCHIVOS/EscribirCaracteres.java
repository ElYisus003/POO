package ARCHIVOS;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirCaracteres {
    public static void main(String[] args) throws IOException {
        FileWriter fw = null;
        File fichero = null;
        byte[] buffer = new byte[81];
        String nombreFichero = null;
        int nbytes;

        try {
            System.out.println("Introduzca el nombre del archivo: ");
            nbytes = System.in.read(buffer);
            nombreFichero = new String(buffer, 0, nbytes - 2);
            fichero = new File(nombreFichero);
            char resp = 's';

            if (fichero.exists()) {
                System.out.println("El archivo ya existe, ¿desea sobreescribirlo? (s/n)");
                resp = (char) System.in.read();
                
            }

            if(resp == 's') {
                System.out.println("Escriba el texto que desea guardar en el archivo: ");
                nbytes = System.in.read(buffer);
                String str = new String(buffer, 0, nbytes);
                fw = new FileWriter(fichero);
                fw.write(str, 0, str.length());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.toString());
        } finally {
            if(fw != null) {
                fw.close();
            }
        }
    }

}
