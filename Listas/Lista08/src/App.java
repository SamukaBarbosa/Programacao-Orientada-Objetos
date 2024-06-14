import exceptions.*;
import loja.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Produto produto = new Produto("Celular", 899.99);
        System.out.println(produto.getNome() + " " + produto.getPreco());

        do {
            try {
                Produto produto1 = new Produto("Tenis", 205.55);
                System.out.println(produto1.getNome() + " " + produto1.getPreco());
                break;
            } catch (NomeInvalidoException | PrecoInvalidoException e) {
                 System.out.println(e.getMessage());
            }
        } while (true);

        do {
            try {
                Produto produto2 = new Produto("Camisa", 28.99);
                System.out.println(produto2.getNome() + " " + produto2.getPreco());
                break;
            } catch (NomeInvalidoException | PrecoInvalidoException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}
