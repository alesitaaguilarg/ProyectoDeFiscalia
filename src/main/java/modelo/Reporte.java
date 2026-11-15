package modelo;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReporte;
    private String tipoReporte;
    private String formato;
    private Date fechaGeneracion;

    public void generarReporte() {}
    public void exportar() {}
    public void imprimir() {}

    public int getIdReporte() { return idReporte; }
    public void setIdReporte(int idReporte) { this.idReporte = idReporte; }
    public String getTipoReporte() { return tipoReporte; }
    public void setTipoReporte(String tipoReporte) { this.tipoReporte = tipoReporte; }
    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }
    public Date getFechaGeneracion() { return fechaGeneracion; }
    public void setFechaGeneracion(Date fechaGeneracion) { this.fechaGeneracion = fechaGeneracion; }
}
