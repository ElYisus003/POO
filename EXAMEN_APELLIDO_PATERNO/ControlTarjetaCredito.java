package EXAMEN_APELLIDO_PATERNO;

public class ControlTarjetaCredito {
    private TarjetaCredito ArrayTarjetaCredito[];
    private int cont = 0;

    public void agregarTarjeta(TarjetaCredito objeto) {
        ArrayTarjetaCredito[cont] = objeto;
        cont++;
    }

    public String reporteGeneral() {
        String cadena = "";

        for (int i = 0; i < cont; i++) {
            cadena += ArrayTarjetaCredito[i].toString() + "\n";
        }

        return cadena;
    }

}
