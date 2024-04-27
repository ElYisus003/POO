package Unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leer {

    public static String dato() {
        String datos = "";

        InputStreamReader SecretariaDeHacienda = new InputStreamReader(System.in);
        BufferedReader flujoE = new BufferedReader(SecretariaDeHacienda);
        try {
			datos = flujoE.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Hubo un error en la entrada de datos"+e.getMessage());
			
		}
        
        return datos;
    }
    
    public static short datoShort() {
    	try {
    	return Short.parseShort(dato());
    	} catch (NumberFormatException error) {
    		
    	}
    	
    	return Short.MIN_VALUE;
    }

	public static int datoInt() {
		try {
			return Integer.parseInt(dato());
		} catch (NumberFormatException error) {
			return Integer.MIN_VALUE;
		}
	}

	public static long datoLong() {
		try {
			return Long.parseLong(dato());
		} catch (NumberFormatException error) {
			return Long.MIN_VALUE;
		}
	}

	public static float datoFloat() {
		try {
			return Float.parseFloat(dato());
		} catch (NumberFormatException error) {
			return Float.NaN;
		}
	}

	public static double datoDouble() {
		try {
			return Double.parseDouble(dato());
		} catch (NumberFormatException error) {
			return Double.NaN;
		}
	}

}
