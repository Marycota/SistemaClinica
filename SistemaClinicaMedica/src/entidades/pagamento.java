package entidades;

import java.util.ArrayList;
import java.util.List;

public class pagamento {
    private double valor;
    private boolean pago;
    private List<Exame> exames;

    public pagamento(double valor) {
        this.valor = valor;
        this.pago = false; 
        this.exames = new ArrayList<>();
    }

    public void adicionarExame(Exame exame) {
        exames.add(exame);
        this.valor += exame.getCusto(); 
    }

    public boolean isPago() {
        return pago;
    }

    public void realizarPagamento() {
        this.pago = true;
        System.out.println("Pagamento realizado com sucesso!");
    }

    public double getValor() {
        return valor;
    }

    public List<Exame> getExames() {
        return exames;
    }
}