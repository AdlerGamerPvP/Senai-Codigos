import static java.lang.IO.*;

void main() {
    println("======Tabuada======");
        int num = Integer.parseInt(readln("Digite o número da tabuada: "));
        int i = 1;
        do {
            println(num + "X" + i + "=" + (i * num));
            i++;
        } while (i <= 10);
    println("=======Fim da tabuada======");
}
