package med.voll.api.domain.consulta;

import org.springframework.data.jpa.repository.*;

import java.time.*;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    boolean existsByPacienteIdAndDataBetween(Long idPaciente, LocalDateTime primeiroHorario, LocalDateTime ultimoHorario);

    boolean existsByMedicoIdAndData(Long idMedico, LocalDateTime data);
}

