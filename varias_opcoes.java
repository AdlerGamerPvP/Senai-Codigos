import static java.lang.IO.*;
void main() {

    println("1 - Opcao 1");
    println("2 - Opcao 2");
    println("3 - Opcao 3");
    println("4 - Sair");


    println("Digite um valor de 1 a 4 ");
    String valor = readln();

    if (valor.equals("1")) {

        println("Voce selecinou a Opcao 1");
    } else if (valor.equals("2")) {

        println("Voce selecionou a Opcao 2");

    }
    else if (valor.equals("3")) {

        println("Voce selecionou a Opcao 3");
    }
    else if (valor.equals("4")) {

        println("Voce selecionou Sair");
    }
    else{
        println("Valor invalido");
    }

    println("Fim");

}
