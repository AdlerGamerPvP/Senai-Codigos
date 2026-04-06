import java.util.Scanner;

public class maior_menor {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        
        System.out.print("Qual distancia você pretende percorrer? : ");
        var dist = sc.nextInt();
        double val;
        
        if (dist <= 200) val = 0.50;
        else val = 0.45;
        
        double ValorDaViagem = dist * val;
        
        System.out.printf("O valor da viagem é de %.2fR$", ValorDaViagem);
        
    }
}
