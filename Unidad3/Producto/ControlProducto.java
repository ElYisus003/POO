package Unidad3.Producto;

import java.io.Serializable;

public class ControlProducto implements Serializable {
    private Producto ArrayProducto[];
    private int con=0, max;

    public ControlProducto(int max) {
        this.max = max;
        ArrayProducto = new Producto[max];
    }

    public boolean Altas(Producto p) {
        if (con < max) {
            ArrayProducto[con] = p;
            con++;
            return true;
        } else {
            return false;
        }
    }

    public String Reporte() {
        String cad = "";
        for (int i = 0; i < con; i++) {
            try {
                cad += ArrayProducto[i].toString() + "\n";
            } catch (NullPointerException e) {
                // TODO: handle exception
            }
        }
        return cad;
    }

    public String Buscar(String nombre) {
        String cad = "";
        for (int i = 0; i < con; i++) {
            try {
                if (ArrayProducto[i].getNombre().equals(nombre)) {
                    cad = ArrayProducto[i].toString();
                }
            } catch (NullPointerException e) {
                // TODO: handle exception
            }
        }
        return cad;
    }

    public int buscarPosicion(String nombre) {
		int pos = -1;
		for (int i = 0; i < con; i++) {
			if(nombre.equals(ArrayProducto[i].getNombre()))
				pos = i;
		}
		return pos;
	}

    public Producto regresaCuenta(int pos) {
		return ArrayProducto[pos];
	}

    public boolean Bajas(String nombre) {
        for (int i = 0; i < con; i++) {
            try {
                if (ArrayProducto[i].getNombre().equals(nombre)) {
                    ArrayProducto[i] = null;
                    con--;
                    return true;
                }
            } catch (NullPointerException e) {
            }
        }
        return false;
    }

    public boolean Cambios(String nombre, String cambioString, int opcion, int cambioInt, double cambioDouble) {
        
        switch (opcion) {
            case 1:
                for (int i = 0; i < con; i++) {
                   try {
                    if (ArrayProducto[i].getNombre().equals(nombre)) {
                        ArrayProducto[i].setNombre(cambioString);
                        return true;
                    }
                   } catch (NullPointerException e) {
                   }
                }   
                break;

            case 2:
                for (int i = 0; i < con; i++) {
                    try {
                        if (ArrayProducto[i].getNombre().equals(nombre)) {
                            ArrayProducto[i].setFechaCaducidad(cambioString);
                            return true;
                        }
                    } catch (NullPointerException e) {
                        // TODO: handle exception
                    }
                }   
                break;

            case 3:
                for (int i = 0; i < con; i++) {
                    try {
                        if (ArrayProducto[i].getNombre().equals(nombre)) {
                            ArrayProducto[i].setNumeroLote(cambioInt);
                            return true;
                        }
                    } catch (NullPointerException e) {
                        // TODO: handle exception
                    }
                }   
                break;

            case 4:
                for (int i = 0; i < con; i++) {
                    try {
                        if (ArrayProducto[i].getNombre().equals(nombre)) {
                            ArrayProducto[i].setCostoProduccion(cambioDouble);
                            return true;
                        }
                    } catch (NullPointerException e) {
                        // TODO: handle exception
                    }
                }   
                break;
                
        }
        
        return false;
    }
    
    public String CalcularPrecioVenta(String nombre) {
        String cad = "";
        for (int i = 0; i < con; i++) {{
            cad = ArrayProducto[i].getNombre() + " " + ArrayProducto[i].precioVenta() + "\n";
            }
        }
        return cad;
    }


}
