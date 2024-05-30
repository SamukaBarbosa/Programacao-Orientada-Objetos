public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro();

        carro.modelo = "Civic";
        carro.anoDoCarro = "2024";
        carro.estaAlinhado = true;
        
        carro.veiculo();
        carro.alinhamento();
        carro.statusCarro();
        System.out.println();

        Tenis tenis = new Tenis();

        tenis.marca = "Nike";
        tenis.esporte = "corrida";
        tenis.ehDeQualidade = true;

        tenis.modeloEsportivo();
        tenis.comprar();
        tenis.sobreOTenis();
        System.out.println();

        Luta luta = new Luta();

        luta.lutador1 = "Myke Thyson";
        luta.lutador2 = "Popó";
        luta.vencedor = "Myke Thyson";
        luta.nocaute = true;
        luta.rounds = 2;
        luta.lutaAcabou = true;

        luta.iniciarLuta();
        luta.nocauteFinalizador();
        luta.resultadosFinais();
    }
}
