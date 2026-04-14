import static java.lang.IO.*;

void main() {
    println("======Tabuada======");
        int num = Integer.parseInt(readln("Digite o número da tabuada: "));

        for (int multi = 1; multi <= 10; multi++) {
            println(num + "X" + multi + "=" + (multi * num));
        }
    println("======Fim da tabuada======");

}
