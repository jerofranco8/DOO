package co.jero.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class Ahorcaito {
    private ArrayList<Palabra> palabras;
    private Jugador jugador;
    private String letraAAdivinar;
    private String palabraAAdivinar;
    private boolean adivino;
    private ArrayList<String> listaDePalabrasDivididas;
    private ArrayList<String> listaDeGuiones;
    private byte ganar;

    public Ahorcaito(Jugador jugador) {
        this.jugador = jugador;
        this.palabras= new ArrayList<>();
        this.listaDeGuiones= new ArrayList<>();
        this.listaDePalabrasDivididas= new ArrayList<>();

    }


    public boolean ingresarPalabra(Palabra palabra){
        byte a = (byte) palabras.stream().filter(palabra1 -> !palabra1.getPalabra().equalsIgnoreCase(palabra.getPalabra())).count();
            if(palabras.size()==a){
                palabras.add(palabra);
                return true;
            }
            else {
                return false;
            }
    }
    public void palabraAleatoria(){
        byte rand= (byte) Math.floor(Math.random()*palabras.size());
        palabraAAdivinar=palabras.get(rand).getPalabra();
    }

    public void listarLaPalabra(){
        String[] palabraDividida= palabraAAdivinar.split("");
        Arrays.asList(palabraDividida).forEach(letra->{
            listaDePalabrasDivididas.add(letra);
            listaDeGuiones.add("_");
        });

    }

    public void jugar(){
        AtomicReference<Byte> a= new AtomicReference<>((byte) 0);
        jugador.setTurnos((byte) (jugador.getTurnos()+1));
        adivino=false;
        listaDePalabrasDivididas.forEach(letra->{

            if (letra.equalsIgnoreCase(letraAAdivinar)){
                listaDeGuiones.set(a.get(),letraAAdivinar);
                adivino=true;
                a.updateAndGet(v -> new Byte((byte) (v + 1)));
                ganar+=1;
            }
            else{
                a.updateAndGet(v -> new Byte((byte) (v + 1)));
            }
        });

        if(adivino==false){
            jugador.setVidas((byte) (jugador.getVidas()-1));
        }
    }

    public boolean ganar(){
        if(ganar==palabraAAdivinar.length()){
            return true;
        }
        else {
            return false;
        }
    }

    public ArrayList<Palabra> getPalabras() {
        return palabras;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public String getLetraAAdivinar() {
        return letraAAdivinar;
    }

    public String getPalabraAAdivinar() {
        return palabraAAdivinar;
    }

    public void setLetraAAdivinar(String letraAAdivinar) {
        this.letraAAdivinar = letraAAdivinar;
    }

    public boolean isAdivino() {
        return adivino;
    }

    public ArrayList<String> getListaDePalabrasDivididas() {
        return listaDePalabrasDivididas;
    }

    public ArrayList<String> getListaDeGuiones() {
        return listaDeGuiones;
    }
}
