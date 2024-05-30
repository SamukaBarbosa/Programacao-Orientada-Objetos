public class Carro {
    String modelo;
    String anoDoCarro;
    boolean estaAlinhado;

    public void veiculo(){
        if (modelo == "Civic" && anoDoCarro == "2024") {
            System.out.println("Carro novo!");
        }else{
            System.out.println("Carro antigo!");
        }
    }

    public void alinhamento(){
        if (estaAlinhado == true){
            System.out.println("O carro está alinhado!");
        }else{
            System.out.println("O carro precisa de uma revisão!");
        }
    }

    public void statusCarro(){
        System.out.println("O " + modelo + " do ano " + anoDoCarro + " está alinhado? " + estaAlinhado);
    }
}
