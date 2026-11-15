package repositorio;

import java.util.List;
import modelo.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Integer> {

    List<Respuesta> findByValorRespuesta(String valorRespuesta);

    List<Respuesta> findByObservacionesContainingIgnoreCase(String texto);
}
