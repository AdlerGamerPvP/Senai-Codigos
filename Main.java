import static java.lang.IO.*;

void main(){
  int fome = 0;
  int energia = 0;
  String mensagem = ("1- Comer " +
                     "2- Descansar " +
                     "3- Humor " +
                     "4- Status " +
                     "5- Sair \n");
  int acao = 0;
  Status crianca = new Status("Filho",34, 34,"happy :D");
  Status crianca2 = new Status(null, 0, 0, null);
  crianca2.setNome(readln("digite o nome da crianca: \n"));
  while(acao != 5) {
      acao = Integer.parseInt(readln(mensagem));
      if (acao == 1) {
          if(fome < 100) {
              fome = fome + 10;
              crianca2.setFome(fome);
              println(crianca2.getNome() + " comeu e esta com " + crianca2.getFome() + " de fome");
              crianca2.getHumor();
          }
          else{
              println(crianca.getNome() + " esta saciado");
          }
      }
      else if (acao == 2){
          if(energia < 100) {
              energia = energia + 10;
              crianca2.setEnergia(energia);
              println(crianca2.getNome() + " descansou e esta com " + crianca2.getEnergia() + " de energia");
              crianca2.getHumor();
          }
          else{
              println(crianca2.getNome() + " esta energizado");
          }
      }
      else if (acao == 3){
          crianca2.getHumor();
          println(crianca2.getNome()  + " " + crianca2.getHumor());
      }
      else if (acao == 4){
          crianca2.getHumor();
          println(crianca2);
      }
      else if (acao == 5){
          return;
      }
      else if (acao == 6){
          crianca2.setNome(readln("Digite o novo nome: "));
      }
      else{
          println("tente novamente");
      }
  }
  println("Volte novamente!");
}