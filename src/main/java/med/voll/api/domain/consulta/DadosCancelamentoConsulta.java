package med.voll.api.domain.consulta;

import jakarta.validation.constraints.*;

public record DadosCancelamentoConsulta(
        @NotNull
        Long idConsulta

) {

}
