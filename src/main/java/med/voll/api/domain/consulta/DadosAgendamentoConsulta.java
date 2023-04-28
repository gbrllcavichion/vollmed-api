package med.voll.api.domain.consulta;

import jakarta.validation.constraints.*;

import java.time.*;

public record DadosAgendamentoConsulta(
        Long idMedico,
        @NotNull
        Long idPaciente,

        @NotNull
        @Future
        LocalDateTime data) {
}
