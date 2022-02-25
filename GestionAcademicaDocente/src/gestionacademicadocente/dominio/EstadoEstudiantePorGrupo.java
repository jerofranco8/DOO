package gestionacademicadocente.dominio;

import java.util.Date;

public class EstadoEstudiantePorGrupo {
    private EstudiantePorGrupo estudiantePorGrupo;
    private TipoEstadoEstudiantePorGrupo estado;
    private String descripcion;
    private Date fecha;

    public EstadoEstudiantePorGrupo(EstudiantePorGrupo estudiantePorGrupo, TipoEstadoEstudiantePorGrupo estado, String descripcion, Date fecha) {
        this.estudiantePorGrupo = estudiantePorGrupo;
        this.estado = estado;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public EstudiantePorGrupo getEstudiantePorGrupo() {
        return estudiantePorGrupo;
    }

    public void setEstudiantePorGrupo(EstudiantePorGrupo estudiantePorGrupo) {
        this.estudiantePorGrupo = estudiantePorGrupo;
    }
}
