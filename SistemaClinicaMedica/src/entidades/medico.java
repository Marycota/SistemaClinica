package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class medico {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String crm;
    private String especialidade;
    private List<consulta> historicoMedico; // Lista de consultas

    public medico(String nome, String cpf, LocalDate dataNascimento, String crm, String especialidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.crm = crm;
        this.especialidade = especialidade;
        this.historicoMedico = new ArrayList<>(); // Inicializando a lista
    }

   
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getCrm() {
        return crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public List<consulta> getHistoricoMedico() {
        return historicoMedico;
    }

    public void adicionarConsulta(consulta consulta) {
        this.historicoMedico.add(consulta);
    }
}

