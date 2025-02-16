package servicos;

import entidades.pagamento;
import excecoes.PagamentoPendente;

import java.util.HashMap;
import java.util.Map;

public class PagamentoServico {
    private Map<String, pagamento> pagamentos = new HashMap<>();

    public void registrarPagamento(pagamento pagamento) {
        pagamentos.put(pagamento.getPaciente().getCpf(), pagamento);
    }

    public void processarPagamento(String cpfPaciente) {
        pagamento pagamento = pagamentos.get(cpfPaciente);

        if (pagamento == null) {
            throw new PagamentoPendente("Nenhum pagamento encontrado para este paciente.");
        }

        pagamento.realizarPagamento();
        System.out.println("💰 Pagamento realizado com sucesso para " getPaciente().getNome());
    }

    public boolean verificarPagamento(String cpfPaciente) {
        pagamento pagamento = pagamentos.get(cpfPaciente);
        return pagamento != null && pagamento.isPago();
    }
}
