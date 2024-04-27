package Unidad3.Personas;

public class Cliente extends Persona {
    private float limiteCredito;

    public Cliente(String nombre, String domicilio, float limiteCredito) {
        super(nombre, domicilio);
        this.limiteCredito = limiteCredito;
    }

    public float getLimiteCredito() { return limiteCredito; }
    public void setLimiteCredito(float limiteCredito) { this.limiteCredito = limiteCredito; }

    @Override
    public String toString() {
        return "Cliente [nombre=" + getNombre() + ", domicilio=" + getDomicilio() + ", limiteCredito=" + limiteCredito + "]";
    }

}
