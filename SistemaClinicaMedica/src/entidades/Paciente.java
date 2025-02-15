package entidades;

import SistemaClinicaMedica.excecoes.PagamentoPendenteException;
import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nome;
    private String cpf;
    private List<consulta> historicoConsultas;

    public Paciente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.historicoConsultas = new ArrayList<>();
    }

    public void agendarConsulta(consulta consulta) throws PagamentoPendenteException {
        for (consulta c : historicoConsultas) {
            if (!c.getPagamento().isPago()) {
                throw new pagamentoPendenteException("Paciente possui pendências financeiras!");
            }
        }
        historicoConsultas.add(consulta);
    }
}
