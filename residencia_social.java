import static java.lang.IO.*;
void main() {

    println("Coloca o consumo mensal de agua em Metros Cubicos:");
    float quant = Float.parseFloat(readln());


    if (quant <= 10) {
        println("A sua conta foi : R$ 7,59 ");

    }

    else if (quant <= 20) {
        double conta = quant * 1.32;
        println("a sua conta foi" + conta + "R$" );
    }

    else if (quant <= 30) {
        double conta = quant * 4.64;

        println("a sua conta foi" + conta + "R$" );
    }

    else if (quant <= 50) {
        double conta = quant * 6.62;
        println("a sua conta foi" + conta + "R$" );
    }

    else {
        double conta = quant * 9.64 ;
        println("a sua conta foi" + conta + "R$" );
    }
}
