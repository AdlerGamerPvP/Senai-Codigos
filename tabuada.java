import static java.lang.IO.*;

void main() {
   println("Escolha o numero da tabuada");
   int tab = Integer.parseInt(readln());

   for (int multi = 1; multi <=10; multi++) {
       int resul = tab * multi;
       println(tab + "x" + multi + "=" + resul);

   }


}
