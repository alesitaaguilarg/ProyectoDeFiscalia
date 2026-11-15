package repositorio;

import java.util.Optional;
import modelo.PeriodoEvaluacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodoEvaluacionRepository extends JpaRepository<PeriodoEvaluacion, Integer> {

    /** Periodo vigente, si existe. */
    Optional<PeriodoEvaluacion> findFirstByActivoTrue();
}
