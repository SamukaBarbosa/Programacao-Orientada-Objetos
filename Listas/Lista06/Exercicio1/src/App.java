import veiculos.Carro;
import veiculos.Moto;

public class App {
    public static void main(String[] args) throws Exception {

        Carro carro = new Carro("Honda", "Civic");
        Moto moto = new Moto("142,8 cv", "CB1000r");

        System.out.println("Carro");
        carro.acelerar();
        carro.frear();

        System.out.println("Moto");
        moto.acelerar();
        moto.frear();
    }
}
