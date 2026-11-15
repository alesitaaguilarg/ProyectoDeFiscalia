package repositorio;

import java.util.List;
import java.util.Optional;
import modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    /** Inicio de sesión por nombre de usuario. */
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);

    /** Inicio de sesión por RFC (el formulario de login pide el RFC). */
    Optional<Usuario> findByRfc(String rfc);

    Optional<Usuario> findByCodigoEmpleado(String codigoEmpleado);

    /** Validaciones de duplicados antes de registrar un usuario. */
    boolean existsByNombreUsuario(String nombreUsuario);

    boolean existsByRfc(String rfc);

    boolean existsByCodigoEmpleado(String codigoEmpleado);

    List<Usuario> findByTipoUsuario(String tipoUsuario);

    List<Usuario> findByAreaAdscripcion(String areaAdscripcion);

    List<Usuario> findByNombreContainingIgnoreCase(String nombre);
}
