package med.voll.api.domain.consulta;

import java.time.*;

public record DadosDetalhamentoConsulta(Long id, Long idMedico, Long idPaciente, LocalDateTime data) {
}
