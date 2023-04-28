package med.voll.api.domain.medico;

import jakarta.validation.constraints.*;
import med.voll.api.domain.endereco.*;

public record DadosAtualizaMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
