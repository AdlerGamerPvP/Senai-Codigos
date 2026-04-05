import static java.lang.IO.*;
void main() {

    println("insira seu consumo mensal de agua no me em m3:");
    float quant = Float.parseFloat(readln());


    if (quant <= 10) {
        println("A sua conta foi : R$22,38  ");

    }

    else if (quant <= 20) {
        double conta = quant * 3.50;
        println("A sua conta foi" + conta + "R$" );
    }


    else if (quant <= 50) {
        double conta = quant * 8.75;
        println("A sua conta foi" + conta + "R$" );
    }

    else {
        double conta = quant * 9.64 ;
        println("A sua conta foi" + conta + "R$" );
    }
}
