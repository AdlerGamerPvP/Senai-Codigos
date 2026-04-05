import static java.lang.IO.*;
void main() {
  println("Informe a sua altura em metros");
    float altura = Float.parseFloat(readln());
  println("Informe o seu peso");
    float peso = Float.parseFloat(readln());
  double IMC = peso / (Math.pow(altura, 2));
  if (IMC < 16) {
    println(IMC + "   Magresa estrema");
  } else if (IMC <= 17) {
    println(IMC + "   Magresa moderada");

  } else if (IMC <=18.5) {
    println(IMC + "   Magresa moderada");
  }
  else if (IMC <=25) {
    println(IMC + "  Saudavel");
  }
  else if (IMC <=30) {
    println(IMC + "  Sobrepeso");
  }
  else if (IMC <=35) {
    println(IMC + "  Obesidade Grau I");
  }

  else if (IMC <=40) {
    println(IMC + "  Obesidade Grau II");
  }
else {
println(IMC + "  Obesidade Grau III");
}
  }



