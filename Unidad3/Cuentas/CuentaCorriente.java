package Unidad3.Cuentas;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CuentaCorriente extends Cuenta implements iFecha, iOtras_Comisiones {
    private int transacciones;
    private double importeTransaccion;
    private int transaccionesExcentas;

    public CuentaCorriente(String nombre, String cuenta, Double saldo, Double tipoInteres, double importeTransaccion,
            int transaccionesExentas) {
        super(nombre, cuenta, saldo, tipoInteres);
        this.importeTransaccion = importeTransaccion;
        this.transaccionesExcentas = transaccionesExentas;
        transacciones = 0;
    }

    public int getTransacciones() { return transacciones; }
    public void setTransacciones(int transacciones) { this.transacciones = transacciones; }

    public double getImporteTransaccion() { return importeTransaccion; }
    public void setImporteTransaccion(double importeTransaccion) { this.importeTransaccion = importeTransaccion; }

    public int getTransaccionesExentas() { return transaccionesExcentas; }
    public void setTransaccionesExentas(int transaccionesExcentas) { this.transaccionesExcentas = transaccionesExcentas; }

    @Override
    public String deposito(double cantidad) {
        String cadena = super.deposito(cantidad);
        transacciones++;
        return cadena;
    }

    public String retiro(double cantidad) {
        String cadena = super.retiro(cantidad);
        transacciones++;
        return cadena;
    }

    @Override
    public double comsiones() {
        double comision = 0;
        GregorianCalendar fechaActual = new GregorianCalendar();
        int dia = fechaActual.get(Calendar.DAY_OF_MONTH);
        if (dia == 1) {
            int n = transacciones - transaccionesExcentas;
            if (n > 0) {
                comision = n * importeTransaccion;
                retiro(comision);
            }
            transacciones = 0;
        }
        return comision;
    }

    @Override
    public double intereses() {
        double interes;
        GregorianCalendar fechaActual = new GregorianCalendar();
        int dia = fechaActual.get(Calendar.DAY_OF_MONTH);
        if (dia != 1) {
            return 0;
        } else {
            if (super.getSaldo() > 10000) {
                interes = super.getSaldo() * 0.10;
            } else {
                interes = super.getSaldo() * 0.05;
                deposito(interes);
            }
        }
        return interes;
    }

    @Override
    public String toString() {
        return "cuentaCorriente [" + super.toString() + "transacciones=" + transacciones + ", importeTransaccion="
                + importeTransaccion + ", transaccionesExentas=" + transaccionesExcentas + "]";
    }

	@Override
	public int dia() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int mes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int año() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float calculaComision() {
		// TODO Auto-generated method stub
		return 0;
	}

}
