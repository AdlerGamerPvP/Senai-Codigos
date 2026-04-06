import java.util.Scanner;

public class multa {

    public static void main(String[] args) {
        Scanner IO = new Scanner(System.in);

        System.out.println("Digite a velocidade: ");
        float spd = IO.nextFloat();

            int top = 80;
            double valorPorKm = 50.0;

        if (spd > top) {
            int excesso = (int) (spd - top);
            double multa = excesso * valorPorKm;

                System.out.println("Limite = " + top + " Km/h");
                System.out.println("Excedeu " + excesso + " Km/h");
                System.out.println("Multa = " + excesso + " Km/h * R$ " + valorPorKm);
                System.out.println("Valor da multa: R$ " + multa);
        } else {
                System.out.println("Velocidade dentro do limite.");
        }

    }
}
