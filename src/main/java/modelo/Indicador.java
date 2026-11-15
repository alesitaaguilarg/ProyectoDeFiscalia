package modelo;

import jakarta.persistence.*;

@Entity
public class Indicador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIndicador;
    private String descripcion;
    private String criterio;
    private double calificacion;

    public int getIdIndicador() { return idIndicador; }
    public void setIdIndicador(int idIndicador) { this.idIndicador = idIndicador; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public String getCriterio() { return criterio; }
    public void setCriterio(String criterio) { this.criterio = criterio; }
    public double getCalificacion() { return calificacion; }
    public void setCalificacion(double calificacion) { this.calificacion = calificacion; }
}
