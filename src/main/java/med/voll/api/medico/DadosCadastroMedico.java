package med.voll.api.medico;

import med.voll.api.endereco.*;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {

}
