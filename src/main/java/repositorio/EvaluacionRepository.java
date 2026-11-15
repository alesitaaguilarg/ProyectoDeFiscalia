package repositorio;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import modelo.Evaluacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluacionRepository extends JpaRepository<Evaluacion, Integer> {

    List<Evaluacion> findByEstado(String estado);

    List<Evaluacion> findByTipo(String tipo);

    List<Evaluacion> findByEstadoAndTipo(String estado, String tipo);

    List<Evaluacion> findByFechaRealizacionBetween(Date desde, Date hasta);

    /** Evaluaciones de un periodo (por sus fechas de inicio y fin). */
    List<Evaluacion> findByPeriodoInicioAndPeriodoFin(Date periodoInicio, Date periodoFin);

    /** Evaluación que contiene un indicador determinado. */
    Optional<Evaluacion> findByIndicadores_IdIndicador(int idIndicador);
}

