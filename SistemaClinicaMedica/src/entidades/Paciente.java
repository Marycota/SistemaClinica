package entidades;

import excecoes.PagamentoPendente;
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

    public void agendarConsulta(consulta consulta) throws PagamentoPendente{
            if (!c.getPagamento().isPago()) {
                throw new PagamentoPendente("Paciente possui pendências financeiras!");
            }
        }
        historicoConsultas.add(consulta);
    }
}
