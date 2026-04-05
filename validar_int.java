import static java.lang.IO.*;

void main()
{
    int num = 0;
 try{
     println("Digite um numero inteiro: ");
     num = Integer.parseInt(readln());
     println("Seu numero é " + num);
 }
 catch(Exception notint){
   println("Dado invalido");
 }



}
