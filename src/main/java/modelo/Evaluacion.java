package modelo;
import java.util.Date;
import java.util.List;

public class Evaluacion {
    private int idEvaluacion;
    private String tipo;
    private Date fechaRealizacion;
    private String estado;
    private Date periodoInicio;
    private Date periodoFin;
    private List<Indicador> indicadores;

    public void guardarBorrador() {}
    public void enviarEvaluacion() {}
    public void validarAntigüedad() {}
}