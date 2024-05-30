public class Tenis {
    String marca;
    String esporte;
    boolean ehDeQualidade;

    public void modeloEsportivo(){
        if (esporte == "corrida"){
            System.out.println("Tenis encontrado!");
        }else{
            System.out.println("Não encontrado!");
        }
    }

    public void comprar(){
        if (marca == "Nike"){
            System.out.println("R$ 350,00");
        }else{
            System.out.println("Produto indisponível!");
        }
    }

    public void sobreOTenis(){
        if (marca == "Nike" && esporte == "corrida") {
            System.out.println("Tenis do(a) " + marca + ", modelo de: " + esporte + ", de alta qualidade " + ehDeQualidade + ", adquirido! ");
        }else{
            System.out.println("Tenis não recomendado!");
        }
    }
}
