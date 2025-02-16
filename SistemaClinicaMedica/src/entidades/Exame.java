package entidades;

public class Exame {
    private String tipo;
    private String resultado;
    private double custo;

    public Exame(String tipo, double custo) {
        this.tipo = tipo;
        this.custo = custo;
        this.resultado = "Aguardando realização";
    }

    public void realizarExame(String resultado) {
        this.resultado = resultado;
    }

    public String getTipo() { return tipo; }
}
