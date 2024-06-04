public class App {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto("Melancia", 17.55, 10);
        Produto produto2 = new Produto("Suco de manga", 5.99, 30);
        Produto produto3 = new Produto("Bolu di murangu", 22.50, 30);

        Loja loja = new Loja("Shop ", "Rua do Limoeiro, 277");

        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produto2);
        loja.adicionarProduto(produto3);

        System.out.println("Produtos cadastrados no " + loja.getNome() + ":");
        loja.listarProdutos();
    }
}
