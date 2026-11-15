package repositorio;

import java.util.List;
import modelo.Reporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReporteRepository extends JpaRepository<Reporte, Integer> {

    List<Reporte> findByDirectora_IdUsuario(int idDirectora);
}
