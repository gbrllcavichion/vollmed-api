package med.voll.api.domain.consulta;

import jakarta.validation.constraints.*;
import med.voll.api.domain.medico.*;

import java.time.*;

public record DadosAgendamentoConsulta(
        Long idMedico,

        @NotNull
        Long idPaciente,

        @NotNull
        @Future
        LocalDateTime data,

        Especialidade especialidade) {
}