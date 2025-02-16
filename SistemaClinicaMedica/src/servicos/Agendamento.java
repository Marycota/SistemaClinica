package servicos;

import entidades.consulta;
import entidades.Paciente;
import excecoes.HorarioIndisponivel;
import excecoes.PagamentoPendente;
import java.util.ArrayList;
import java.util.List;

public class Agendamento {
    private List<consulta> consultas = new ArrayList<>();

    public void agendarConsulta(consulta novaConsulta) {
        for (consulta consulta : consulta) {
            if (consulta.getMedico().equals(novaConsulta.getMedico()) &&
                consulta.getData().equals(novaConsulta.getData()) &&
                consulta.getHorario().equals(novaConsulta.getHorario())) {
                throw new HorarioIndisponivel("Horário já ocupado.");
            }
        }

        if (novaConsulta.getPaciente().isPagamentoPendente()) {
            throw new PagamentoPendente("Paciente com pagamento pendente.");
        }

        consultas.add(novaConsulta);
        Notificacao.enviarNotificacao("Consulta agendada com sucesso!");
    }
}
