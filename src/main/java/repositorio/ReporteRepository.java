package repositorio;

import java.util.Date;
import java.util.List;
import modelo.Reporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReporteRepository extends JpaRepository<Reporte, Integer> {

    List<Reporte> findByTipoReporte(String tipoReporte);

    List<Reporte> findByFormato(String formato);

    List<Reporte> findByTipoReporteAndFormato(String tipoReporte, String formato);

    List<Reporte> findByFechaGeneracionBetween(Date desde, Date hasta);
}
