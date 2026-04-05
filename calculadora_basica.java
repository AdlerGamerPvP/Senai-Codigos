import static java.lang.IO.*;
void main() {
    println("1 - Adicao");
    println("2 - Subtracao");
    println("3 - Multiplicacao");
    println("4 - Divisao");
    println("5 - Potencia");
    println("6 - Raiz Quadrada");
    println("7 - Numero Par");
    println("8 - Numero Impar");

    println("Insira o primeiro valor");
    float valor1 = Float.parseFloat(readln());

    println("Insira o segundo valor");
    float valor2 = Float.parseFloat(readln());

    println("Insira um valor das operacoes acima");
    String operacao = readln();
    if (operacao.equals("1")){
        float soma = valor1 + valor2;
        println(soma);
    }

    else if (operacao.equals("2")) {

        float subtracao = valor1 - valor2;
        println(subtracao);

    }

    else if (operacao.equals("3")) {

        float multiplicacao = valor1 * valor2;
        println(multiplicacao);
    }
    else if (operacao.equals("4")) {

        float divisao = valor1 / valor2;
        println(divisao);
    }
    else if (operacao.equals("5")) {

        double potencia = Math.pow(valor1 , valor2 );
        println(potencia);
    }

    else if (operacao.equals("6")) {
        float soma2 = valor1 + valor2;
        double raiz_quadrada = Math.sqrt(soma2);
        println(raiz_quadrada);
    }

    }
