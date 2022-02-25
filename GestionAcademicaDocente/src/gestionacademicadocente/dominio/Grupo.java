package gestionacademicadocente.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Grupo {

	private String codigo;
	private Sede sede;
	private Profesor profesor;
	private Materia materia;
	private Date fechaInicio;
	private Date fechaFin;
	private List<EstudiantePorGrupo> estudiantes;

	public void matricularEstudiante(Estudiante estudiante) {
		EstudiantePorGrupo estudiantePorGrupo = new EstudiantePorGrupo(estudiante, this);

		if (estudiantes==null|| posibilidadDeMatricularEstudiante(estudiante)==true ){
			obtenerEstudiantes().add(estudiantePorGrupo);
		}
		else{
			System.out.println("No paipiiii");
		}
		
		// 2. No se puede cruzar con otro grupo en el mismo intervalo de tiempo
		
		// 4. Registrar un estado por estudiante por grupo: MATRICULADO
	}

	public boolean posibilidadDeMatricularEstudiante(Estudiante estudiante){
		AtomicBoolean validacion= new AtomicBoolean(false);
		for (EstudiantePorGrupo estudiante1 : estudiantes) {
			if (estudiante != estudiante1.getEstudiante()) {
				validacion.set(true);
				EstadoEstudiantePorGrupo estadoEstudiantePorGrupo = new EstadoEstudiantePorGrupo(estudiante1,);

			} else {
				validacion.set(false);
				break;
			}
		}
		return validacion.get();
	}

	private List<EstudiantePorGrupo> obtenerEstudiantes() {
		if (estudiantes == null) {
			estudiantes = new ArrayList<>();
		}
		
		return estudiantes;
	}

	public List<EstudiantePorGrupo> getEstudiantes() {
		return estudiantes;
	}
}
