public class Bicicleta {
    public String modelo;
    public int ano;
    public String fabricante;

    public Bicicleta(String modelo, int ano, String fabricante){
        this.modelo = modelo;
        this.ano = ano;
        this.fabricante = fabricante;
    }
    public Bicicleta(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;

    }

    @Override
    public String toString() {
        return fabricante + "\n" + ano + "\n" + modelo + "\n";
    }
    public String pedalar(){
        return "A bicicleta esta sendo pedalada";
    }
    public String frear(){
        return "A bicicleta esta freando";
    }

}