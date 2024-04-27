package Unidad3.Personas;

public class Empleado extends Persona {
    private float salario;

    public Empleado(String nombre, String domicilio, float salario) {
        super(nombre, domicilio);
        this.salario = salario;
    }

    public float getSalario() { return salario; }
    public void setSalario(float salario) { this.salario = salario; }

    @Override
    public String toString() {
        return "Empleado [nombre=" + getNombre() + ", domicilio=" + getDomicilio() + ", salario=" + salario + "]";
    }

}
