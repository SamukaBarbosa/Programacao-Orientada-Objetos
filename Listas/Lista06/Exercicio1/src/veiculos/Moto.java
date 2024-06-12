package veiculos;

public class Moto implements Veiculo {
    private String potencia;
    private String modelo;

    public Moto(String potencia, String modelo) {
        this.potencia = potencia;
        this.modelo = modelo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    
    public void acelerar() {
        System.out.println("Ran dan dan dan! Minino que velocidade é essa.");
    }

    @Override

    public void frear() {
        System.out.println("Skrrrrr! A moto freiou.");
    }
}
