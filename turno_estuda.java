import static java.lang.IO.*;
void main() {

    println("Digite qual turno do dia voce estuda atualmente (M , T ou N) ");
    String turno_de_estudo = readln();

    if (turno_de_estudo.equals("M")){
        println("Bom Dia!");
    }

    else if (turno_de_estudo.equals("T")) {
     println("Boa Tarde!");
    }
else if (turno_de_estudo.equals("N")) {
    println("Boa Noite!");
    }
else{
    println("Valor Invalido!");
    }
}
