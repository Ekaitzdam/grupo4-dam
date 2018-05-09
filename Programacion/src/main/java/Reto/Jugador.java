package Reto;

public class Jugador {

    private int cpd_jugador;
    private String nombre;
    private String nickname;
    private double sueldo;

    private Duenio duenio;

    public Jugador(int cpd_jugador, String nombre, String nickname, double sueldo) {
        this.cpd_jugador = cpd_jugador;
        this.nombre = nombre;
        this.nickname = nickname;
        this.sueldo = sueldo;
    }

    public int getCpd_jugador() {
        return cpd_jugador;
    }

    public void setCpd_jugador(int cpd_jugador) {
        this.cpd_jugador = cpd_jugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
