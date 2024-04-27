package Unidad3.Cuentas;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CuentaAhorro extends Cuenta implements iFecha, iOtras_Comisiones {

    private double cuotaMantenimiento;

    public CuentaAhorro(String nombre, String cuenta, double saldo, double tipoInteres, double cuotaMantenimiento) {
        super(nombre, cuenta, saldo, tipoInteres);
        this.cuotaMantenimiento = cuotaMantenimiento;
    }

    public double getCuotaMantenimiento() { return cuotaMantenimiento; }
    public void setCuotaMantenimiento(double cuotaMantenimiento) { this.cuotaMantenimiento = cuotaMantenimiento; }

    @Override
    public double comsiones() {
        GregorianCalendar fechaActual = new GregorianCalendar();
        int dia = fechaActual.get(Calendar.DAY_OF_MONTH);
        if (dia == 1) {
            retiro(cuotaMantenimiento);
            return cuotaMantenimiento;
        } else {
            return 0;
        }
    }

    @Override
    public double intereses() {
        double intereses;
        GregorianCalendar fechaActual = new GregorianCalendar();
        int dia = fechaActual.get(Calendar.DAY_OF_MONTH);
        if (dia == 1) {
            intereses = getSaldo() * getTipoInteres() / 100;
            deposito(intereses);
            return intereses;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "cuentaAhorro [" + super.toString() + "cuotaMantenimiento=" + cuotaMantenimiento + "]";
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
