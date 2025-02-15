package entidades;

import java.time.LocalDate;

public class Exame {
    private String tipo;
    private LocalDate dataPrescricao;
    private LocalDate dataRealizacao;
    private String resultado;
    private pagamento pagamento;

    public Exame(String tipo, LocalDate dataPrescricao, double custo) {
        this.tipo = tipo;
        this.dataPrescricao = dataPrescricao;
        this.pagamento = new pagamento(custo);
        this.resultado = "PENDENTE"; 
    }

    public void realizarExame(LocalDate dataRealizacao, String resultado) {
        if (!pagamento.isPago()) {
            throw new RuntimeException("Exame não pode ser realizado sem pagamento!");
        }
        this.dataRealizacao = dataRealizacao;
        this.resultado = resultado;
    }

    public pagamento getPagamento() {
        return pagamento;
    }
}
