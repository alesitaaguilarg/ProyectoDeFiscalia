package repositorio;

import java.util.List;
import modelo.Evaluacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluacionRepository extends JpaRepository<Evaluacion, Integer> {

    List<Evaluacion> findByReceptor_IdUsuario(int idReceptor);

    List<Evaluacion> findByEmisor_IdUsuario(int idEmisor);

    List<Evaluacion> findByPeriodo_IdPeriodo(int idPeriodo);

    List<Evaluacion> findByReceptor_IdUsuarioAndEstado(int idReceptor, String estado);
}
