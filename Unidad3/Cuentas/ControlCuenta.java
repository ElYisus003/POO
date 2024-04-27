package Unidad3.Cuentas;

public  class ControlCuenta {
	private Cuenta cuentas[];
	private int cont, max;

	public ControlCuenta() {
		max = 10;
		cuentas = new Cuenta[max];
		cont = 0;
	}
	
	public boolean altaCuenta(Cuenta cuenta) {
		boolean agrego = false;
		if(cont < max){
			cuentas[cont] = cuenta;
			cont++;
			agrego = true;
		}
		return agrego;
	}

	public String reporteGeneral() {
		String cadena = "";
		for (int i = 0; i < cont; i++) {
			cadena += cuentas[i].toString();
		}
		return cadena;
	}

    public String depositar(double dinero, String cuenta) {
        String cadena = "No encontrado";
        for (int i = 0; i < cont; i++) {
            if (cuentas[i].equals(cuenta)) {
                cadena = cuentas[i].deposito(dinero);
            }
        }
        return cadena;
    }

	public String retirar(double dinero, String cuenta) {
		String cadena = "No encontrado";
		for (int i = 0; i < cont; i++) {
			if (cuentas[i].equals(cuenta)) {
				cadena = cuentas[i].retiro(dinero);
			}
		}
		return cadena;
	}

	public int buscarPosicion(String nombre) {
		int pos = -1;
		for (int i = 0; i < cont; i++) {
			if(nombre.equals(cuentas[i].getNombre()))
				pos = i;
		}
		return pos;
	}

	public String buscarCuenta(String nombre) {
		String cadena = "No encontrado";
		for (int i = 0; i < cont; i++) {
			if(nombre.equals(cuentas[i].getNombre()))
				cadena = cuentas[i].toString();
		}
		return cadena;
	}

	public Cuenta regresaCuenta(int pos) {
		return cuentas[pos];
	}

	public String reporteCCorriente() {
		String cadena = "";
		for (Cuenta c : cuentas) {
			if (c instanceof CuentaCorriente) {
				cadena += c.toString();
			}
		}
		return cadena;
	}

	public String reporteCAhorro() {
		String cadena = "";
		for (Cuenta c : cuentas) {
			if (c instanceof CuentaAhorro) {
				cadena += c.toString();
			}
		}
		return cadena;
	}

	public void mostrarCuenta() {

		System.out.println("Nombre \t Cuenta \t Saldo \t Tipo de Interes \t Comisiones \t Intereses");
		
		for(Cuenta c: cuentas){
			System.out.println(c.getNombre() + "\t" + c.getCuenta() + "\t" + c.getSaldo() + "\t" + c.getTipoInteres()
								+ "\t");
		}
		
	}

}
