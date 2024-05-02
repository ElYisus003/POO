package Unidad3.Producto;

public interface OTROS_COSTOS {
    public final static double mantoEquipo=2000; //mantenimiento de equipo
    public final static double valorAF=50000000; //valor del activo fijo
    public final static double rentaMaquinaria=1000; //renta de maquinaria
    public final static double costoTransporte=300; //costo de transporte

    public abstract double calculaOtrosCostos();
    public abstract double costoDepFisAF();

}
