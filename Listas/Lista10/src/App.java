import java.util.Arrays;

import locadora.AudioVisual;
import locadora.Filme;
import locadora.Jogo;
import locadora.Locadora;

public class App {
    public static void main(String[] args) throws Exception {
        Filme filme = new Filme("Vingadores", "Anthony Russo", Arrays.asList("Robert Downey Jr.", "Cris Evans", "Tom Holland"));
        Jogo jogo = new Jogo("Sonic the Hedgehog", "Ps2");

        Locadora<AudioVisual> locadora = new Locadora<>();

        locadora.adicionarItem(filme);
        locadora.adicionarItem(jogo);
        System.out.println("Itens disponíveis na locadora:");
        locadora.listarItens();

        String tituloBusca = "";
        System.out.println("Buscando item com título: " + tituloBusca);
        AudioVisual itemBuscado = locadora.buscarItem(tituloBusca);
        if (itemBuscado != null) {
            itemBuscado.exibirInfo();
        } else {
            System.out.println("Item não encontrado.");
        }
    }
}