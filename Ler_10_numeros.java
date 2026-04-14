import static java.lang.IO.*;

void main() {
    int soma = 0;
    int maior = 0;
    int menor = 0;
    int pares = 0;
    int impares = 0;
    float media = 0;
    //pede 10 números diferentes
    //5 2 7 10 8 50 500 4 67 0

    for (int i = 1; i <= 10; i++) {
        int num = Integer.parseInt(readln("Digite um número: "));
        soma += num;
        //if que verifica os impares e pares
        if (num % 2 == 0) {
            pares += 1;
        } else {
            impares += 1;
        }
        if (i == 1) {
            maior=num;
            menor=num;
        }
        if (num>maior){
            maior=num;
        }
        if (num<menor){
            menor=num;

        }

        media = soma / 10;
    }
    println("Maior = " + maior);
    println("Menor = " + menor);
    println("Média = " + media);
    println("Impares = " + impares);
    println("Pares = " + pares);
    println("Soma = " + soma);
}
