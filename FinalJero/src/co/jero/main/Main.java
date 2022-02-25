package co.jero.main;

import co.jero.domain.Ahorcaito;
import co.jero.domain.Jugador;
import co.jero.domain.Palabra;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Jugador jugador =new Jugador();

        Ahorcaito ahorcaito = new Ahorcaito(jugador);


        while (true){

            int option = JOptionPane.showOptionDialog(null,"¿Que deseas hacer en el juego?","AHORCAITO",0,0,new ImageIcon("C:\\Users\\SSPEEDKILLER\\IdeaProjects\\Final Jero\\icon.png"),
                    new Object[]{"Ingresar una palabra","Jugar","salirte"},3);

            switch (option) {
                case 0: {

                    boolean a=ahorcaito.ingresarPalabra(new Palabra(JOptionPane.showInputDialog(null,"Ingrese la palabra","PALBRAS",JOptionPane.INFORMATION_MESSAGE)));
                    if(a==true){{
                        JOptionPane.showMessageDialog(null,"La palabra fue añadida exitosamente","",JOptionPane.INFORMATION_MESSAGE);

                    }}
                    else {
                        JOptionPane.showMessageDialog(null,"La palabra no pude ser agregada ya que esa palabra ya existe","",JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                }
                case 1: {
                    if(ahorcaito.getPalabras().size()==0){
                        JOptionPane.showMessageDialog(null,"Antes de poder ingresar al juego debes agregar palabras","",JOptionPane.ERROR_MESSAGE);
                        break;
                    }

                    ahorcaito.getJugador().setNombre(JOptionPane.showInputDialog(null, "Nombre", "NOMBRE", JOptionPane.INFORMATION_MESSAGE));
                    ahorcaito.palabraAleatoria();
                    ahorcaito.listarLaPalabra();
                    while (true) {
                        if (jugador.getVidas() != 0) {

                            if(ahorcaito.ganar()==false) {

                                String letra = JOptionPane.showInputDialog(null, jugador.getNombre() + " escribe una letra para poder adivinar la palabra \n" + ahorcaito.getListaDeGuiones(), "NOMBRE", JOptionPane.INFORMATION_MESSAGE);
                                byte a= (byte) ahorcaito.getListaDeGuiones().stream().filter(x->x.equalsIgnoreCase(letra)).count();

                                if (letra.length() == 1) {
                                    if(a==0) {
                                        ahorcaito.setLetraAAdivinar(letra);
                                        ahorcaito.jugar();

                                        if (ahorcaito.isAdivino() == true) {
                                            JOptionPane.showMessageDialog(null, "Felicidades atinaste con la letra, te quedan  " + jugador.getVidas() + " vidas y llevas " + jugador.getTurnos() + " turno(s) \n" + ahorcaito.getListaDeGuiones(), "", JOptionPane.INFORMATION_MESSAGE);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Fallaste con la letra, te quedan " + jugador.getVidas() + " vidas y llevas " + jugador.getTurnos() + " turno(s) \n" + ahorcaito.getListaDeGuiones(), "", JOptionPane.ERROR_MESSAGE);
                                        }
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "Ya ingresaste esa letra, ingresa una diferente", "", JOptionPane.ERROR_MESSAGE);
                                        
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(null, "Debes ingresar una sola letra", "", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            else {
                                JOptionPane.showMessageDialog(null, jugador.getNombre()+ " FELICIDADES ganaste con un total de "+jugador.getTurnos()+" INTENTOS \n"+ ahorcaito.getListaDeGuiones(), "GANASTE", JOptionPane.INFORMATION_MESSAGE);
                                JOptionPane.showMessageDialog(null, "Vuelve pronto "+jugador.getNombre(), "GRACIAS POR JUGAR", JOptionPane.INFORMATION_MESSAGE);
                                option= JOptionPane.CLOSED_OPTION;
                                break;
                            }
                        }
                        else {
                            JOptionPane.showMessageDialog(null,jugador.getNombre()+" perdiste e hiciste un total de  "+jugador.getTurnos()+" turnos \n"
                                    + ahorcaito.getListaDeGuiones()+"\n"+ahorcaito.getListaDePalabrasDivididas(),"PERDISTE",JOptionPane.ERROR_MESSAGE);
                            JOptionPane.showMessageDialog(null, "Vuelve pronto "+jugador.getNombre(), "GRACIAS POR JUGAR", JOptionPane.INFORMATION_MESSAGE);
                            option= JOptionPane.CLOSED_OPTION;
                            break;

                        }
                    }
                    break;
                }
                case 2: {
                    option= JOptionPane.CLOSED_OPTION;
                    break;
                }
            }
            if(option== JOptionPane.CLOSED_OPTION){
                break;
            }
        }
    }
}
