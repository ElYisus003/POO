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
        if (dia() == 1) {
            retiro(cuotaMantenimiento);
            return cuotaMantenimiento;
        } else {
            return 0;
        }
    }

    @Override
    public double intereses() {
        double intereses;
        
        if (dia() == 1) {
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
		GregorianCalendar fechaActual = new GregorianCalendar();
        return fechaActual.get(DIA_DEL_MES);
	}

	@Override
	public int mes() {
		GregorianCalendar fechaActual = new GregorianCalendar();
        return fechaActual.get(MES_DEL_AÑO);
	}

	@Override
	public int año() {
		GregorianCalendar fechaActual = new GregorianCalendar();
        return fechaActual.get(AÑO);
	}

	@Override
	public float calculaComision() {
		// TODO Auto-generated method stub
		return 0;
	}

}
