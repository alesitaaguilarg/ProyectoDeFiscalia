package modelo;
import java.util.Date;

public class Usuario {
    protected int idUsuario;
    protected String nombre;
    protected String codigoEmpleado;
    protected String rfc;
    protected String cargo;
    protected String puesto;
    protected String areaAdscripcion;
    protected Date fechaIngreso;
    protected String nombreUsuario;
    protected String contrasena;
    protected String tipoUsuario;

    public void iniciarSesion() {}
    public void cerrarSesion() {}
    public void recuperarContrasena() {}
}