package repositorio;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import modelo.PeriodoEvaluacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodoEvaluacionRepository extends JpaRepository<PeriodoEvaluacion, Integer> {

    /** Periodo marcado como activo, si existe. */
    Optional<PeriodoEvaluacion> findFirstByActivoTrue();

    List<PeriodoEvaluacion> findByActivo(boolean activo);

    /** Periodos vigentes en una fecha: pasar la misma fecha en los dos parámetros. */
    List<PeriodoEvaluacion> findByFechaInicioLessThanEqualAndFechaFinGreaterThanEqual(Date fecha1, Date fecha2);
}
