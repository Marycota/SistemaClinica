package entidades;

public class pagamento {
    private double valor;
    private boolean pago;

    public pagamento(double valor) {
        this.valor = valor;
        this.pago = false; 
    }

    public void realizarPagamento() {
        this.pago = true;
    }

    public boolean isPago() {
        return pago;
    }

    public double getValor() {
        return valor;
    }
}

