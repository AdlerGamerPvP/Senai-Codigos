import static java.lang.IO.*;
void main() {
    println("Digite a nota 1");
    float nota1 = Float.parseFloat(readln());
    println("Digite a nota 2");
    float nota2 = Float.parseFloat(readln());
    println("Digite a nota 3");
    float nota3 = Float.parseFloat(readln());
    println("Digite a nota 4");
    float nota4 = Float.parseFloat(readln());
    float media_final = (nota1 + nota2 + nota3 + nota4) / 4;
    if (media_final <= 3.9) {
        println(nota1);
        println(nota2);
        println(nota3);
        println(nota4);
        println("Sua media final foi :     " + media_final);
        println("Categoria : E");
        println("Voce esta reprovado");
    } else if (media_final <= 5.9) {
        println(nota1);
        println(nota2);
        println(nota3);
        println(nota4);
        println("Sua media final foi :     " + media_final);
        println("Categoria : D");
        println("Voce esta reprovado");
    } else if (media_final <= 7.4) {
        println(nota1);
        println(nota2);
        println(nota3);
        println(nota4);
        println("Sua media final foi :     " + media_final);
        println("Categoria : C");
        println("Voce esta aprovado");
    } else if (media_final <= 8.9) {
        println(nota1);
        println(nota2);
        println(nota3);
        println(nota4);
        println("Sua media final foi :     " + media_final);
        println("Categoria : B");
        println("Voce esta aprovado");
    }
else  {
        println(nota1);
        println(nota2);
        println(nota3);
        println(nota4);
        println("Sua media final foi :     " + media_final);
        println("Categoria : A");
        println("Voce esta aprovado");
    }
}
