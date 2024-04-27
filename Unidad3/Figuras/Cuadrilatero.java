package Unidad3.Figuras;

public abstract class Cuadrilatero {
    private float base, altura;

    public Cuadrilatero(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() { return base; }
    public void setBase(float base) { this.base = base; }

    public float getAltura() { return altura; }
    public void setAltura(float altura) { this.altura = altura; }

    public abstract float calcularArea();

	@Override
	public String toString() {
		return "Cuadrilatero [base=" + base + ", altura=" + altura + "]";
	}

}