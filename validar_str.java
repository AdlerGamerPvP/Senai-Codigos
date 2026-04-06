import java.util.Scanner;

public class validar_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = sc.nextLine();

        // Verifica se está vazio ou só com espaços
        if (texto.trim().isEmpty()) {
            System.out.println("Dado inválido");
        } else {
            System.out.println("Você digitou: " + texto);
        }

        sc.close();
    }
}
