package gestionacademicadocente.dominio;

public class EstudiantePorGrupo {

	private Estudiante estudiante;
	private Grupo grupo;

	public EstudiantePorGrupo(Estudiante estudiante, Grupo grupo) {
		this.estudiante = estudiante;
		this.grupo = grupo;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
}
