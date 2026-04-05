import static java.lang.IO.*;
void main() {
    println("Insira o valor do lado A");
     float ladoA = Float.parseFloat(readln());
    println("Insira o valor do lado B");
     float ladoB = Float.parseFloat(readln());
    println("Insira o valor do lado C");
     float ladoC = Float.parseFloat(readln());
     float somaAB = ladoA + ladoB;
     float somaAC = ladoA + ladoC;
     float somaBC = ladoC + ladoB;

    if (somaAB > ladoC && somaAC > ladoB && somaBC > ladoA ){
        if (ladoA == ladoB && ladoC == ladoB && ladoA == ladoC ){
            println("Esse triangulo e um Equilatero");

        }
        else if (ladoA == ladoB || ladoC == ladoB || ladoC == ladoA) {
            println("Esse triangulo e um Isosceles");
        }

        else{
            println("Esse e um triangulo Escaleno");
        }
    }

else{
    println("Isso nao e um triangulo");
    }
