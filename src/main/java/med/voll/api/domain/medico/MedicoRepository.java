package med.voll.api.domain.medico;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

    Page<Medico> findAllByAtivoTrue(Pageable paginacao);
}