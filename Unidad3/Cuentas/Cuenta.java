package Unidad3.Cuentas;

public abstract class Cuenta {
    private String nombre;
    private String cuenta;
    private Double saldo;
    private Double tipoInteres;

    public Cuenta(String nombre, String cuenta, Double saldo, Double tipoInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(Double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public abstract double comsiones();

    public abstract double intereses();

    public String deposito(double cantidad) {
        String cadena = "catidad introducida no es valida";
        if (cantidad > 0) {
            saldo += cantidad;
            cadena = "deposito realizado corrrectamente";
        }
        return cadena;
    }

    public String retiro(double cantidad) {
        String cadena = "";
        if (cantidad <= saldo) {
            saldo -= cantidad;
            cadena = "retiro exitoso";
        }
        return cadena;
    }

    @Override
    public String toString() {
        return "[nombre=" + nombre + ", cuenta=" + cuenta + ", saldo=" + saldo + ", tipoInteres=" + tipoInteres + "]";
    }

}
