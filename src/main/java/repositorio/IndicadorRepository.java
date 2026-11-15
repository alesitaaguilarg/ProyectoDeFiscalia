package repositorio;

import java.util.List;
import modelo.Indicador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndicadorRepository extends JpaRepository<Indicador, Integer> {

    List<Indicador> findByEvaluacion_IdEvaluacion(int idEvaluacion);
}
