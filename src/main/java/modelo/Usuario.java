package modelo;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity // Le dice a Spring Boot: "Convierte esta clase en una tabla de MySQL"
public class Usuario {

    @Id // Indica que este es el identificador principal (Primary Key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Hace que el ID sea autoincrementable (1, 2, 3...)
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