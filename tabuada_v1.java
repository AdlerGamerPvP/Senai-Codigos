import static java.lang.IO.*;

void main() {
    println("========Tabuada========");
        int num = Integer.parseInt(readln("Digite o número da tabuada: "));
       //cria a variavel na mesma linha que pede o valor da variavel^

        //loop while = enquanto
        //valor inicial do loop

        int i = 1;
        while(i <= 10) {
            println(i + "x" + num + "=" + (i * num));
            i++;
        }

    println("======Fim da tabuada======");

}
