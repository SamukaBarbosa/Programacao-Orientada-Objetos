import animais.Cachorro;
import animais.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro("Husk siberiano", 3);
        Gato gato = new Gato("Mel", "Siâmes");

        System.out.println("Cachorro: ");
        cachorro.comer();
        cachorro.emitirSom();

        System.out.println("\nGato: ");
        gato.comer();
        gato.emitirSom();
    }
}
