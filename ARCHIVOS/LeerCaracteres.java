package ARCHIVOS;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerCaracteres {
    public static void main(String[] args) throws IOException {
        byte[] nomFich = new byte[100];
        char[] buffer = new char[100];
        String nombreFichero = null;
        File fichero = null;
        FileReader fr;
        int nbytes, ncars;

        do {
            System.out.println("Introduzca el nombre del archivo: ");
            nbytes = System.in.read(nomFich);
            nombreFichero = new String(nomFich, 0, nbytes - 2);
            fichero = new File(nombreFichero);

        } while (!fichero.exists());

        fr = new FileReader(fichero);
        ncars = fr.read(buffer, 0, 100);

        System.out.println(buffer);
        fr.close();

    }

}
