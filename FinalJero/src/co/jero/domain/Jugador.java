package co.jero.domain;

public class Jugador {
    private String nombre;
    private byte vidas=8;
    private byte turnos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getVidas() {
        return vidas;
    }

    public byte getTurnos() {
        return turnos;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public void setVidas(byte vidas) {
        this.vidas = vidas;
    }

    public void setTurnos(byte turnos) {
        this.turnos = turnos;
    }
}
