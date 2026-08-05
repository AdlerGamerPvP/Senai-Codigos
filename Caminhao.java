public class Caminhao {
    public String cor;
    public String modelo;
    public int pesomax;
    public String marca;

    public Caminhao(String cor, String modelo, int pesomax, String marca){
        this.cor = cor;
        this.modelo = modelo;
        this.pesomax = pesomax;
        this.marca = marca;
    }
    public Caminhao(String marca, String modelo, int pesomax) {
        this.marca = marca;
        this.modelo = modelo;
        this.pesomax = pesomax;
    }



    @Override
    public String toString() {
        return marca + "\n" + modelo + "\n" + pesomax + "KG" + "\n" + cor + "\n";
    }
    public String acelerar(){
        return "O caminhão esta acelerando";
    }
    public String frear(){
        return "O caminhão esta freando";
    }
    public String ligar(){
        return "o caminhão esta ligado";
    }
}