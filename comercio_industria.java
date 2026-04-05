import static java.lang.IO.*;
void main() {

    println("insira seu consumo mensal de agua no me em m3:");
    float quant = Float.parseFloat(readln());


    if (quant <= 10) {
        println("a sua conta foi : R$44.95  ");

    }

    else if (quant <= 20) {
        double conta = quant * 8.75;
        println("a sua conta foi" + custo + "R$" );
    }


    else if (quant <= 50) {
        double conta = quant * 16.76;
        println("a sua conta foi" + custo + "R$" );
    }

    else {
        double conta = quant * 17.46 ;
        println("a sua conta foi" + custo + "R$" );
    }
}
