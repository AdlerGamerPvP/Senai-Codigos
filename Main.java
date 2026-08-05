import static java.lang.IO.*;

void main() {
   Carro carro1 = new Carro("Vermelho", "Skyline", 2026, "Nissan", "74HBV75G");
   Moto moto1 = new Moto("Azul", "PCX160", 2026, "Honda");
   Caminhao caminhao1 = new Caminhao("Verde", "FH",5000,"Volvo");
   Bicicleta bicicleta1 = new Bicicleta("Aro 29", 2026, "Montano");

   println(carro1);
   println(moto1);
   println(caminhao1);
   println(bicicleta1);


}
