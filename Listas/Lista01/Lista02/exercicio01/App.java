import java.util.Scanner;

public class App {
    private static final int QUANTIDADE_PERGUNTAS = 3;
    private static final int QUANTIDADE_TENTATIVAS = 1;

    private static String[] RESPOSTAS = new String[QUANTIDADE_PERGUNTAS];
    private static String[] GABARITO = new String[QUANTIDADE_PERGUNTAS]; 
    private static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String nomeDoJogador = nomeDoJogador();

        iniciarQuiz(nomeDoJogador);

        primeiraPergunta(nomeDoJogador);

        segundaPergunta(nomeDoJogador);

        resultadoDoQuiz(nomeDoJogador);
    }

        /* Pode ser colocado o nome que preferir */
    public static String nomeDoJogador(){
        System.out.println(
            """
            Seja bem vindo ao quiz sobre games!
            Está preparado?

            Digite seu nome para começarmos:
            """);
        return formatarNome(SCAN.nextLine());      
    }

        /* A primeira letra do seu nome será formatada para ficar maiúscula */
    public static String formatarNome(String nome){
        if(nome.isBlank() || nome.isEmpty()){
            return "Espaço vazio";
        }
        nome = nome.trim();

        String[] nomeJunto = nome.split(" ");
        String analisandoNome = nomeJunto[0];

        String separandoNome = String.valueOf(analisandoNome.charAt(0));
        String primeiraLetra = separandoNome;

        String nomeSemPrimeiraLetra = analisandoNome.substring(1);

        String nomeModificado = primeiraLetra.toUpperCase() + nomeSemPrimeiraLetra.toLowerCase();

        return nomeModificado;
    }

    public static void iniciarQuiz(String nomeDoJogador){
        System.out.println(String.format(
            """
            
            Olá %s!
            Ao iniciar o quiz fique atento ao marcar as respostas, pois se você marcar uma resposta/letra diferente 
            a questão será inválidada! 

            Após o aviso pressione "Enter" para continuar.
            """, nomeDoJogador));

        SCAN.nextLine();
    }

    public static void primeiraPergunta(String nome){
        String resposta = "";

        do{
            System.out.println(
            """
            1 - Qual é o jogo mais jogado no mundo?

            a. Roblox
            b. Fortnite
            c. Minecraft
            d. League of Legends
            """
        );

        resposta = SCAN.nextLine();
        
    }while(!acertouAPergunta(resposta));

    GABARITO[0] = "c";
        RESPOSTAS[0] = resposta;
    }

    public static boolean acertouAPergunta(String resposta){
        if(resposta.isBlank()){
            System.out.println(
                """
                Vamos tentar novamente.

                """
            );
            return false;
        }

        return true;
    }

    public static void segundaPergunta(String nome){
        String resposta = "";

        do{
            System.out.println(
                """
                2 - Quais são os protagonistas das seguintes franquias: 
                (The Legend of Zelda; Undertale; EarthBound; GTA San Andreas).
                OBS: Deve ser na mesma ordem que estão as franquias.

                a. Link; Ness; Frisk; CJ.
                b. Frisk; Ness; Link; CJ.
                c. CJ; Link; Ness; Frisk
                d. Link; Frisk; Ness; CJ.
                        
                """
            );
            
            resposta = SCAN.nextLine();

        }while(!acertouAPergunta2(resposta));

        RESPOSTAS[1] = resposta;
        GABARITO[1] = "d";
    }

    public static boolean acertouAPergunta2(String resposta){
        if(resposta.isBlank()){
            System.out.println(
                """
                Vamos tentar novamente.

                """
            );
            return false;
        }

        return true;
    }

    public static void resultadoDoQuiz(String nomeDoJogador){
        System.out.println(String.format(
            """
            %s       
            """,
            nomeDoJogador
            ));

            for(int i = 0; i < QUANTIDADE_PERGUNTAS; i++){
                System.out.println(String.format(
                    "%s - %s",
                        (i + 1), RESPOSTAS[i].equalsIgnoreCase(GABARITO[i]) ? "CORRETO" : "INCORRETO"
                ));
            }
        }
    }