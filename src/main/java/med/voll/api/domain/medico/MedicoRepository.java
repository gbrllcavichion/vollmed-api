package med.voll.api.domain.medico;

import med.voll.api.domain.endereco.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;

import java.time.*;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

    Page<Medico> findAllByAtivoTrue(Pageable paginacao);

    @Query(""" 
                select m from Medico m 
                where 
                m.ativo = true 
                and 
                m.especialidade = :especialidade
                and
                m.id not in(
                    select c.medico.id from Consulta c
                    where
                    c.data = :data
                )
                order by rand()
                limit 1
            """)
    Medico escolherMedicoAleatorioLivreNaData(Especialidade especialidade, LocalDateTime data);

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
