package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.*;
import med.voll.api.domain.consulta.*;

import java.time.*;

public class ValidadorHorarioAntecedencia implements ValidadorAgendamentoDeConsulta{


    public void validar(DadosAgendamentoConsulta dados) {
        var dataConsulta = dados.data();
        var agora = LocalDateTime.now();
        var diferencaEmMinutos = Duration.between(agora, dataConsulta).toMinutes();

        if (diferencaEmMinutos < 30) {
            throw new ValidacaoException("Consulta deve ser agendada com antecedencia minima de 30 minutos");
        }
    }

}
