package Reto;

import java.util.Date;

public class Jornada {

    private int cod_jornada;
    private Date fecha;
    private int resultado;

    public Jornada(int cod_jornada, Date fecha, int resultado) {
        this.cod_jornada = cod_jornada;
        this.fecha = fecha;
        this.resultado = resultado;
    }

    public int getCod_jornada() {
        return cod_jornada;
    }

    public void setCod_jornada(int cod_jornada) {
        this.cod_jornada = cod_jornada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
