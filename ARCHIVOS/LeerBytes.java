package ARCHIVOS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LeerBytes {
    public static void main(String[] args) throws FileNotFoundException, Exception {
        FileInputStream fis = null;
        byte[] buffer = new byte[81];
        int nbytes;

        fis = new FileInputStream("Texto1.txt");
        nbytes = fis.read(buffer, 0, 81);
        String str = new String(buffer, 0, nbytes);
        System.out.println(str);
    }

}
