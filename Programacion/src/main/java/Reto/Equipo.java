package Reto;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre_equipo;
    private double sueldo_anual;

    private List<Jugador> jugadores = new ArrayList<>();

    public Equipo(String nombre_equipo, double sueldo_anual) {
        this.nombre_equipo = nombre_equipo;
        this.sueldo_anual = sueldo_anual;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public double getSueldo_anual() {
        return sueldo_anual;
    }

    public void setSueldo_anual(double sueldo_anual) {
        this.sueldo_anual = sueldo_anual;
    }
}
