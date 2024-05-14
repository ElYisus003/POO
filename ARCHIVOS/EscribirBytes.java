package ARCHIVOS;

import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirBytes {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        byte[] buffer = new byte[81];
        int nbytes;

        System.out.println("Introduzca el texto que desea guardar: ");
        try {
			nbytes = System.in.read(buffer);
            fos = new FileOutputStream("Texto1.txt", true);
            fos.write(buffer, 0, nbytes);
		} catch (IOException e) {
			System.out.println("Error: " + e.toString());
		} finally {
            try {
				fos.close();
			} catch (IOException e) {
				System.out.println("Error: " + e.toString());
			}
        }
    }

}
