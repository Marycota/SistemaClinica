package entidades;

public class pagamento {
    private Paciente paciente;
    private double valor;
    private boolean pago;

    public pagamento(Paciente paciente, double valor) {
        this.paciente = paciente;
        this.valor = valor;
        this.pago = false;
    }

    public void realizarPagamento() {
        this.pago = true;
        paciente.setPagamentoPendente(false);
    }

    public boolean isPago() { return pago; }
}
