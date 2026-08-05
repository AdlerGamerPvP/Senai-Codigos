public class Carro {
    public String cor;
    public String modelo;
    public int ano;
    public String marca;
    public String chassisID;

    public Carro(String cor, String modelo, int ano, String marca, String chassisID){
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
        this.chassisID = chassisID;
    }
    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return marca + "\n" + modelo + "\n" + ano + "\n" + cor + "\n" + chassisID + "\n";
    }
    public String acelerar(){
        return "O carro esta acelerando";
    }
    public String frear(){
        return "O carro esta freando";
    }
    public String ligar(){
        return "o carro esta ligado";
    }
}
