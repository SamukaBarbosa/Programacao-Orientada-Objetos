import escola.Aluno;
import escola.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno("Samuel", "samuel.aluno.ifsp.edu.br", "123");
        Professor professor = new Professor("Davi", "davi@gmail.com", "POO");

        aluno.exibirInfo();
        professor.exibirInfo();

        aluno.exibirInfo(true, true, false);
        professor.exibirInfo(true, false, true);
    }
}
