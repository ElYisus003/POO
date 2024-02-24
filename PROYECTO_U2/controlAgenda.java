package PROYECTO_U2;

public class controlAgenda {
    private Agenda array[];
    private int cont, max;

    public controlAgenda() {
        cont = 0;
        max = 15;
        array = new Agenda[max];
    }

    public boolean agregaAgenda(Agenda objeto) {
        boolean agregado = false;

        if(cont < max) {
            array[cont] = objeto;
            cont++;
            agregado = true;
        }

        return agregado;
    }

    public String reporteGeneral() {
        String cadena = "";

        for(int i = 0; i < cont; i++) {
            cadena += array[i].toString() + "\n";
        }

        return cadena;
    }

}
