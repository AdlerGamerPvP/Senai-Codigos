import static java.lang.IO.*;

void main() {
    println("Digite G para Gasolina e A para Alcool: ");
    String tipo = readln();
    if (tipo.contains("a") || tipo.contains("A") ) {
        println("Digite a quantidade de litros: ");
        double litros = Double.parseDouble(readln());
        if (litros <= 20) {
            double valor = ((litros * 2.89) * 0.97);
            println("Valor é: " + valor);
        } else {
            double valor = ((litros * 2.89) * 0.95);
            println("Valor é: " + valor);
        }
    }
    else if (tipo.contains("g") || tipo.contains("G") )
    {
        println("Digite a quantidade de litros: ");
        double litros = Double.parseDouble(readln());
        if (litros <= 20) {
            double valor = ((litros * 4.95) * 0.96);
            println("Valor é: " + valor);
        } else {
            double valor = ((litros * 4.95) * 0.94);
            println("Valor é: " + valor);
        }
    }
    else {
        println("valor invalido, por favor digite só uma das duas escolhas");
    }
}1
