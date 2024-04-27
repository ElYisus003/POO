package Unidad2;

public class sobrecargaMultiplicacion {
    private int a;
    private int b;
    
	public sobrecargaMultiplicacion(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() { return a; }
	public void setA(int a) { this.a = a; }

	public int getB() {	return b; }
	public void setB(int b) { this.b = b; }

    public int multiplicar() {
        return a * b;
    }

    public int multiplicar(int c) {
        return a * b * c;
    }

    public long multiplicar(long c) {
        return a * b * c;
    }

    public byte multiplicar(int c, byte d){
        return (byte) (a * b * c * d);
    }

    public float multiplicar(byte c, int d){
        return c * d;
    }

    

}
