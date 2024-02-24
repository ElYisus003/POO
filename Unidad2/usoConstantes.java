package Unidad2;

public class usoConstantes {
    private int numCuenta;
    private double saldo;
    private final static float interes = 12.5f;
    
	public usoConstantes(int numCuenta, double saldo) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}

    public double calcularSaldo() {
        final float interes2 = 2.5f;
        float resultado;
        resultado = (float) ((saldo * interes) + (saldo * interes2));
        return resultado;
    }

	public int getNumCuenta() { return numCuenta; }
	public void setNumCuenta(int numCuenta) { this.numCuenta = numCuenta; }

	public double getSaldo() { return saldo; }
	public void setSaldo(double saldo) { this.saldo = saldo; }

	public static float getInteres() { return interes; }

	@Override
	public String toString() {
		return "usoConstantes [numCuenta=" + numCuenta + ", saldo=" + saldo + "]";
	}
    
}
