package Exceptions;

public class MusicaNaoEncontradaException extends Exception {
    public MusicaNaoEncontradaException() {
        super("Música não encontrada.");
    }
}
