package Reto;

public class Temporada {

    private int cod_temporada;
    private String clasificacion;

    public Temporada(int cod_temporada, String clasificacion) {
        this.cod_temporada = cod_temporada;
        this.clasificacion = clasificacion;
    }

    public int getCod_temporada() {
        return cod_temporada;
    }

    public void setCod_temporada(int cod_temporada) {
        this.cod_temporada = cod_temporada;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
}
