package co.jero.main;

import gestionacademicadocente.dominio.Estudiante;
import gestionacademicadocente.dominio.EstudiantePorGrupo;
import gestionacademicadocente.dominio.Grupo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Grupo grupo1= new Grupo();
        EstudiantePorGrupo estudiantePorGrupo1= new EstudiantePorGrupo(estudiante1,grupo1);
        EstudiantePorGrupo estudiantePorGrupo2=new EstudiantePorGrupo(estudiante2,grupo1);




    }


}
