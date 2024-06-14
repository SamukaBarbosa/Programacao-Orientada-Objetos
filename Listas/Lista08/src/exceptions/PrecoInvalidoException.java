package exceptions;

public class PrecoInvalidoException extends Exception {
    public PrecoInvalidoException() {
        super("O preço precisa ser positivo(Maior que zero).");
    }
}
