package excecoes;

public class HorarioIndisponivel extends RuntimeException {
    public HorarioIndisponivel(String mensagem) {
        super(mensagem);
    }
}