package Persona;

public class CFecha {
    private int dia, mes, año;

    public CFecha() {
        
    }

    public CFecha(int dia) {
        this.dia = dia;
    }

    public CFecha(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public CFecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public CFecha(CFecha fecha) {
        dia = fecha.dia;
        mes = fecha.mes;
        año = fecha.año;
    }
    
    protected boolean bisiesto() {
        return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
    }

    public void asignarFecha(int dd, int mm, int aa) {
        dia = dd;
        mes = mm;
        año = aa;
    }

    public void obtenerFecha(int [] fecha) {
        fecha[0] = dia;
        fecha[1] = mes;
        fecha[2] = año;
    }

    public boolean fechaCorrecta() {
        boolean añoCorrecto, mesCorrecto, diaCorrecto=false;

        añoCorrecto = (año >= 1997 && año <= 2005);
        mesCorrecto = (mes >= 1 && mes <= 12);

        switch (mes) {
            case 2:
                if (bisiesto()) {
                    diaCorrecto = (dia >= 1 && dia <= 29);
                } else {
                    diaCorrecto = (dia >= 1 && dia <= 28);
                }
                break;

            case 4: case 6: case 9: case 11:
                diaCorrecto = (dia >= 1 && dia <= 30);
                break;

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diaCorrecto = (dia >= 1 && dia <= 31);
                break;
        }

        return (diaCorrecto && mesCorrecto && añoCorrecto);
    }

}
