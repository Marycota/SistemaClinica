package entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class consulta {
    private LocalDate data;
    private LocalTime horario;
    private int duracaoMinutos;
    private String status; 
    private Paciente paciente;
    private medico medico;
    private List<Exame> examesPrescritos;
    private List<String> medicamentosPrescritos;
    private pagamento pagamento;

    public consulta(LocalDate data, LocalTime horario, Paciente paciente, medico medico, double valor) {
    if (!paciente.isPagamentoEmDia()) {
        throw new PagamentoPendente("Paciente possui pagamentos pendentes e não pode agendar nova consulta.");
   {
   }
   }
        this.data = data;
        this.horario = horario;
        this.duracaoMinutos = 30; 
        this.status = "AGENDADA";
        this.paciente = paciente;
        this.medico = medico;
        this.examesPrescritos = new ArrayList<>();
        this.medicamentosPrescritos = new ArrayList<>();
        this.pagamento = new pagamento(valor);
    }
    public void realizarPagamento() {
        pagamento.realizarPagamento();
    }

    public void adicionarExame(Exame exame) {
        this.examesPrescritos.add(exame);
    }

    public void adicionarMedicamento(String medicamento) {
        this.medicamentosPrescritos.add(medicamento);
    }

    public void realizarConsulta() {
        if (!pagamento.isPago()) {
            throw new RuntimeException("Consulta não pode ser realizada sem pagamento!");
        }
        this.status = "REALIZADA";
    }

    public pagamento getPagamento() {
        return pagamento;
    }

    public String getStatus() {
        return status;
    }
}
