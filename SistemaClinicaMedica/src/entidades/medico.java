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
    private List<consulta> historicoConsultas = new ArrayList<>();

    public medico(String nome, String cpf, LocalDate dataNascimento, String crm, String especialidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public void adicionarConsulta(consulta consulta) {
        historicoConsultas.add(consulta);
    }

    public String getEspecialidade() { return especialidade; }
    public String getNome() { return nome; }
}
