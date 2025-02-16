package entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class consulta {
    private Paciente paciente;
    private medico medico;
    private LocalDate data;
    private LocalTime horario;
    private int duracaoMinutos;
    private double valor;
    private String status;
    private List<Exame> examesPrescritos = new ArrayList<>();
    private List<String> medicamentos = new ArrayList<>();

    public consulta(Paciente paciente, medico medico, LocalDate data, LocalTime horario, double valor) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.horario = horario;
        this.duracaoMinutos = 30;
        this.valor = valor;
        this.status = "AGENDADA";
    }

    public void adicionarExame(Exame exame) {
        examesPrescritos.add(exame);
    }

    public void prescreverMedicamento(String medicamento) {
        medicamentos.add(medicamento);
    }

    public Paciente getPaciente() { return paciente; }
    public medico getMedico() { return medico; }
}
