import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner amongus = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = amongus.nextLine();

        System.out.println("Digite a nota da SA1: ");
        float nota_um = amongus.nextFloat();

        System.out.println("Digite a nota da SA2: ");
        float nota_dois = amongus.nextFloat();

//       what is this faggot saying

        float media = ((nota_um + nota_dois) / 2);

        String resultado;

        if (media >= 4) {
            resultado = "voce falhou tá de recuperação xddddddddddddd";
        } else if (media >= 6) {
            resultado = "voce ganhou :D";
        } else {
            resultado = "voce reprovou seu burro xdddddddd";
        }

        System.out.println("Nome: " + nome + " Nota 1: " + nota_um + " Nota 2: " + nota_dois + " Media:" + media);
        System.out.println("Seu resultado é: " + resultado);

    }

}