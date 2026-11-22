package modelo;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class PeriodoEvaluacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPeriodo;
    private Date fechaInicio;
    private Date fechaFin;
    private boolean activo;

    public void verificarVigencia() {}

    public int getIdPeriodo() { return idPeriodo; }
    public void setIdPeriodo(int idPeriodo) { this.idPeriodo = idPeriodo; }
    public Date getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(Date fechaInicio) { this.fechaInicio = fechaInicio; }
    public Date getFechaFin() { return fechaFin; }
    public void setFechaFin(Date fechaFin) { this.fechaFin = fechaFin; }
    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }
}
