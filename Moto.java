public class Moto {
    public String cor;
    public String modelo;
    public int ano;
    public String marca;

    public Moto(String cor, String modelo, int ano, String marca){
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return marca + "\n" + modelo + "\n" + ano + "\n" + cor + "\n";
    }
    public String acelerar(){
        return "A moto esta acelerando";
    }
    public String frear(){
        return "A moto esta freando";
    }
    public String ligar(){
        return "A moto esta ligada";
    }
}