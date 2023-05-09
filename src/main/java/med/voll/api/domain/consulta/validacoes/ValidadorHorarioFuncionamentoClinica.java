package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.*;
import med.voll.api.domain.consulta.*;

import java.time.*;

public class ValidadorHorarioFuncionamentoClinica implements ValidadorAgendamentoDeConsulta{

    public void validar(DadosAgendamentoConsulta dados) {
        var dataConsulta = dados.data();

        var domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var antesDaAberturaDaClinica = dataConsulta.getHour() < 7;
        var depoisDoEncerramentoDaClinica = dataConsulta.getHour() > 18;

        if (domingo || antesDaAberturaDaClinica || depoisDoEncerramentoDaClinica) {
            throw new ValidacaoException("Consulta fora do horario de funcionamento da clínica");
        }
    }
}
