package modelo;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Evaluacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvaluacion;
    private String tipo;
    private Date fechaRealizacion;
    private String estado;
    private Date periodoInicio;
    private Date periodoFin;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Indicador> indicadores;

    public void guardarBorrador() {}
    public void enviarEvaluacion() {}
    public void validarAntiguedad() {}

    public int getIdEvaluacion() { return idEvaluacion; }
    public void setIdEvaluacion(int idEvaluacion) { this.idEvaluacion = idEvaluacion; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public Date getFechaRealizacion() { return fechaRealizacion; }
    public void setFechaRealizacion(Date fechaRealizacion) { this.fechaRealizacion = fechaRealizacion; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public Date getPeriodoInicio() { return periodoInicio; }
    public void setPeriodoInicio(Date periodoInicio) { this.periodoInicio = periodoInicio; }
    public Date getPeriodoFin() { return periodoFin; }
    public void setPeriodoFin(Date periodoFin) { this.periodoFin = periodoFin; }
    public List<Indicador> getIndicadores() { return indicadores; }
    public void setIndicadores(List<Indicador> indicadores) { this.indicadores = indicadores; }
}
