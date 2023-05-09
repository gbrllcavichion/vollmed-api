package med.voll.api.domain.paciente;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Page<Paciente> findAllByAtivoTrue(Pageable paginacao);
    @Query("""
            select p.ativo
            from Paciente p
            where
            p.id = :id
            """)
    Boolean findAtivoById(Long id);

}