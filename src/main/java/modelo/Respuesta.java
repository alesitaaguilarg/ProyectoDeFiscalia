package modelo;

import jakarta.persistence.*;

@Entity
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRespuesta;
    private String valorRespuesta;
    private String observaciones;

    public int getIdRespuesta() { return idRespuesta; }
    public void setIdRespuesta(int idRespuesta) { this.idRespuesta = idRespuesta; }
    public String getValorRespuesta() { return valorRespuesta; }
    public void setValorRespuesta(String valorRespuesta) { this.valorRespuesta = valorRespuesta; }
    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }
}
