package repositorio;

import java.util.Optional;
import modelo.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Integer> {

    Optional<Respuesta> findByIndicador_IdIndicador(int idIndicador);
}
