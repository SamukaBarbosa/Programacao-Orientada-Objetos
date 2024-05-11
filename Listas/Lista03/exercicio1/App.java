import java.util.Scanner;

public class App {
    public static final int ANO_FINAL = 2024;
    public static int calcularIdade(int anoDeNascimento) {
        return ANO_FINAL - anoDeNascimento;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int anoDeNascimento = scanner.nextInt();
        int idadeFinal = calcularIdade(anoDeNascimento);
        System.out.println("Ate o final de 2024 voce tera " + idadeFinal + " anos ");

        scanner.close();
  }
}