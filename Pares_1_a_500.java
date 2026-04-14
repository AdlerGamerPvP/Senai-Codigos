import static java.lang.IO.*;


void main() {
    int soma = 0;
    int i = 1;
    while(i<=500) {
        if (i % 2 == 0) {
            soma += i;
        }
        i++;
    }
    println(soma);
}
