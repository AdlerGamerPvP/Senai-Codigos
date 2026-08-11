public class Status {
    private String nome;
    private int fome;
    private int energia;
    private String humor;



   public void setNome(String nome){
       this.nome = nome;
   }

   public void setFome(int fome){
       this.fome = fome;
   }


   public void setEnergia(int energia){
       this.energia = energia;
       if(energia >= 100){
           energia = 100;
       }
   }

   public String getNome(){
       return nome;
   }
   public int getFome(){
       return fome;
   }

    public int getEnergia(){
        return energia;
    }
   public String getHumor(){
       int media = ((fome + energia) / 2);
       if(media <= 25){
           humor = "tá ruim";
       }
       else if(media <= 50){
           humor = "tá ok";
       }
       else if(media <= 75){
           humor = "ta bom";

       }
       else if(media <= 100){
           humor = "ta perfeito";
       }
       return humor;
   }


   public int media(){
       return ((fome + energia) / 2);
   }

   public Status(String nome, int fome, int energia, String humor){
       this.nome = nome;
       this.fome = fome;
       this.energia = energia;
       this.humor = humor;
   }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" + "Fome: " + fome + "\n" + "Energia: " + energia + "\n" + "Humor: " + humor;
    }
}
