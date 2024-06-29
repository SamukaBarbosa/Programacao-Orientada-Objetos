package locadora;

import java.util.ArrayList;
import java.util.List;

public class Locadora<T extends AudioVisual> {
    private List<T> acervo;

    public Locadora() {
        this.acervo = new ArrayList<>();
    }

    public void adicionarItem(T item) {
        acervo.add(item);
    }

    public void listarItens() {
        for (T item : acervo) {
            item.exibirInfo();
        }
    }

    public T buscarItem(String titulo) {
        for (T item : acervo) {
            if (item instanceof Filme) {
                Filme filme = (Filme) item;
                if (filme.getTitulo().equalsIgnoreCase(titulo)) {
                    return item;
                }
            } else if (item instanceof Jogo) {
                Jogo jogo = (Jogo) item;
                if (jogo.getTitulo().equalsIgnoreCase(titulo)) {
                    return item;
                }
            }
        }
        return null;
    }
}