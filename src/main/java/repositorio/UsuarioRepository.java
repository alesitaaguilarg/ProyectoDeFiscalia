package repositorio;

import java.util.List;
import java.util.Optional;
import modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    /** Para el inicio de sesión. */
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);

    /** Para el inicio de sesión con RFC (el formulario de login pide el RFC). */
    Optional<Usuario> findByRfc(String rfc);

    /** Para validar duplicados antes de registrar un usuario. */
    boolean existsByNombreUsuario(String nombreUsuario);

    boolean existsByCodigoEmpleado(String codigoEmpleado);

    boolean existsByRfc(String rfc);

    List<Usuario> findByTipoUsuario(String tipoUsuario);
}
