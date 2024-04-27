package EXAMEN_APELLIDO_PATERNO;

public class TarjetaCredito {
    private String nombreCliente;
    private int numeroCuenta;
    private byte codigoCliente;
    private float saldo;
    private final static float limiteCredito = 20000;

    public TarjetaCredito(String nombreCliente, int numeroCuenta, byte codigoCliente, float saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.codigoCliente = codigoCliente;
        this.saldo = saldo;
    }

    public TarjetaCredito(String nombreCliente, int numeroCuenta, byte codigoCliente) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.codigoCliente = codigoCliente;
        this.saldo = 1000;
    }

    public TarjetaCredito(String nombreCliente, int numeroCuenta) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.codigoCliente = 123;
        this.saldo = 1000;
    }

    public String comprarTarjeta(float monto) {
        String mensaje = "";

        if (monto > limiteCredito) {
            mensaje = "El monto excede el límite de crédito";

        } else if (monto >= 2000 || monto <= 3000) {
            monto = monto - (monto * 0.05F);
            saldo += monto;
            mensaje = "Compra realizada con éxito, se aplicó un descuento del 5%";

        } else {
            saldo += monto;
            mensaje = "Compra realizada con éxito";
        }

        return mensaje;
    }

    public String pagarTarjeta(float monto) {
        String mensaje = "";

        if (monto > saldo) {
            mensaje = "El monto excede el saldo de la tarjeta";

        } else {
            saldo -= monto;
            mensaje = "Pago realizado con éxito";
        }

        return mensaje;
    }

	public String getNombreCliente() { return nombreCliente; }
	public void setNombreCliente(String nombreCliente) { this.nombreCliente = nombreCliente; }

	public int getNumeroCuenta() { return numeroCuenta; }
	public void setNumeroCuenta(int numeroCuenta) { this.numeroCuenta = numeroCuenta; }

	public byte getCodigoCliente() { return codigoCliente; }
	public void setCodigoCliente(byte codigoCliente) { this.codigoCliente = codigoCliente; }

	public float getSaldo() { return saldo; }
	public void setSaldo(float saldo) { this.saldo = saldo; }

	public float getLimiteCredito() { return limiteCredito; }

	@Override
	public String toString() {
		return "TarjetaCredito [nombreCliente=" + nombreCliente + ", numeroCuenta=" + numeroCuenta + ", codigoCliente="
				+ codigoCliente + ", saldo=" + saldo + ", limiteCredito=" + limiteCredito + "]";
	}
    
    

}
