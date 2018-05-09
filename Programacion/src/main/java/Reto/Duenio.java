package Reto;

import java.util.ArrayList;
import java.util.List;

public class Duenio {

    private int cod_duenio;
    private String nombre;
    private String apellidos;


    public Duenio(int cod_duenio, String nombre, String apellidos) {
        this.cod_duenio = cod_duenio;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getCod_duenio() {
        return cod_duenio;
    }

    public void setCod_duenio(int cod_duenio) {
        this.cod_duenio = cod_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
