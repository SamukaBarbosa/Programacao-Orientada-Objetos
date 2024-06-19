import java.util.ArrayList;

import eventos.Show;
import eventos.StandUp;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> artistas = new ArrayList<>();
        artistas.add("Luciano Pavarotti");
        artistas.add(" Andrea Bocelli");
        artistas.add(" Elvis Presley");

        Show show = new Show("Show dos Tenores", "Estádio Nacional", "27/07/2024", artistas);
        show.exibirInformacoes();
        show.comecarEvento();
        show.comecarEvento(true);

        StandUp standup = new StandUp("Stand-Up Comedy Night", "Teatro Central", "10/08/2024", "Thiago Ventura");
        standup.exibirInformacoes();
        standup.comecarEvento();
        standup.comecarEvento("Por que os fantasmas são péssimos em contar mentiras? Porque são transparentes.");
    }
}
