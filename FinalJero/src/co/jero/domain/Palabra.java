package co.jero.domain;

public class Palabra {
    private String palabra;

    public Palabra(String palabra) {
        this.palabra = palabra;

    }

    @Override
    public String toString() {
        return palabra;
    }
    public String getPalabra() {
        return palabra;
    }
}
