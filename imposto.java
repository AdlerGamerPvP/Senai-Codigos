import static java.lang.IO.*;
void main() {
println("Insira seu salario em R$");
double salario = Double.parseDouble(readln());
double inss = salario * 0.05;

if (salario <= 2500){
   double irrf = salario * 0.075;
    double desconto = irrf + inss ;

   println("O desconto no seu salario foi de: " + "R$" + desconto);
}

else if (salario <= 3500) {
double irrf = salario * 0.15;
double desconto = irrf + inss;

println("Seu desconto foi: " + "R$" + desconto);
}
else if (salario <= 4500 ) {
    double irrf = salario * 0.225;
    double desconto = irrf + inss;

    println("Seu desconto foi: " + "R$" + desconto);
}

else{
    double irrf = salario *  0.275;
    double desconto = irrf + inss;
    println("Seu desconto foi : " + "R$" + desconto);
}

}
