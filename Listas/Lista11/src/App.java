import Exceptions.MusicaNaoEncontradaException;

public class App {
    public static void main(String[] args) throws Exception {
        Musica musica = new Musica("Garota de Ipanema", "Tom Jobim", "The Girl from Ipanema");
        Musica musica2 = new Musica("Con te Partiro", "Andrea Bocelli", "Bocelli");
        Musica musica3 = new Musica("My Way", "Franky Sinatra", "My Way");

        BibliotecaMusical biblioteca = new BibliotecaMusical();
        biblioteca.adicionarMusica(musica.getTitulo(), musica);
        biblioteca.adicionarMusica(musica2.getTitulo(), musica2);

        biblioteca.buscarMusica(musica2.getTitulo());
        try {
            System.out.println(biblioteca.buscarMusica(musica3.getTitulo()));
        } catch (MusicaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }
    }
}
