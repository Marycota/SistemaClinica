package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private List<consulta> historicoMedico = new ArrayList<>();
    private boolean pagamentoPendente;

    public Paciente(String nome, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.pagamentoPendente = false;
    }

    public void adicionarConsulta(consulta consulta) {
        historicoMedico.add(consulta);
    }

    public boolean isPagamentoPendente() {
        return pagamentoPendente;
    }

    public void setPagamentoPendente(boolean pagamentoPendente) {
        this.pagamentoPendente = pagamentoPendente;
    }

    public String getnome() { return nome; }
    public String getcpf() { return cpf; }
    public String getPaciente() {return Paciente ;}
}

