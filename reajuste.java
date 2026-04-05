import static java.lang.IO.*;
void main() {
    println("Insira seu salario:");
    double salario = Double.parseDouble(readln());

    if (salario<=1000){
        double aumento_valor = salario * 0.2;
        double reajuste = salario + aumento_valor;
        println("Salario Digitado:    R$" + salario );
        println("Aumento: 20%");
        println("Aumento:   R$" + aumento_valor);
        println("Salario Reajustado:    R$"  + reajuste);
    }
    else if (salario<=1700) {
        double aumento_valor = salario * 0.15;
        double reajuste = salario + aumento_valor;
        println("Salario digitado:    R$" + salario);
        println("Aumento: 15%");
        println("Aumento:   R$" + aumento_valor);
        println("salario reajustado:    R$" + reajuste);
    }

    else if (salario<=2300) {
        double aumento_valor = salario * 0.1;
        double reajuste = salario + aumento_valor;
        println("Salario digitado:    R$" + salario);
        println("Aumento: 10%");
        println("Aumento:   R$" + aumento_valor);
        println("salario reajustado:    R$" + reajuste);
    }

    else {
        double aumento_valor = salario * 0.05;
        double reajuste = salario + aumento_valor;
        println("Salario digitado:    R$" + salario);
        println("Aumento: 5%");
        println("Aumento:   R$" + aumento_valor);
        println("salario reajustado:    R$" + reajuste);
    }
}
