package med.voll.api.medico;

import jakarta.validation.constraints.*;
import med.voll.api.endereco.*;

public record DadosAtualizaMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
