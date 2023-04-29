package med.voll.api.domain.medico;

import med.voll.api.domain.endereco.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

    Page<Medico> findAllByAtivoTrue(Pageable paginacao);

    record DadosDetalhamentoMedico(Long id,
                                          String nome,
                                          String email,
                                          String crm,
                                          String telefone,
                                          Especialidade especialidade,
                                          Endereco endereco) {
        public DadosDetalhamentoMedico(Medico medico) {
            this(medico.getId(),
                    medico.getNome(),
                    medico.getEmail(),
                    medico.getCrm(),
                    medico.getTelefone(),
                    medico.getEspecialidade(),
                    medico.getEndereco());
        }

    }
}
