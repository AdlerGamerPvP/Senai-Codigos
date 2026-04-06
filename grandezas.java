import java.util.Scanner;

public class grandezas
{
	public static void main(String[] args) {
	    var sc = new Scanner(System.in);
	    
	    System.out.println("******************************");
	    System.out.println("CÁLCULO DE GRANDEZAS ELÉTRICAS");
	    System.out.println("******************************");
	    System.out.println("1. Tensão (em Volt)");
	    System.out.println("2. Resistencia (em Ohm)");
        System.out.println("3. Corrente (em Ampére)");
        System.out.println("4. Sair do programa");
        System.out.println("******************************");
        System.out.println("Qual grandeza deseja calcular?");
        
        int esc = sc.nextInt();
        
    if (esc == 1){
         System.out.println("Informe o valor da Resistência (em Ohm): ");
            double R = sc.nextDouble();
         System.out.println("Informe o valor da Corrente (em Ampére): ");
            double I = sc.nextDouble();
            double FU = R * I;
             System.out.println("A tensão (U) é: " + FU);
    }
     if (esc == 2) {
         System.out.println("Informe o valor da Tensão (em Volt): ");
            double U = sc.nextDouble();
         System.out.println("Informe o valor da Corrente (em Ampére): : ");
            double I = sc.nextDouble();
            double FR = U / I;
             System.out.println("A Resistência (R) é: " + FR);
	}
	
     if (esc == 3) {
         System.out.println("Informe o valor da Tensão (em Volt): ");
            double U = sc.nextDouble();
         System.out.println("Informe o valor da Resistencia (em Ohm): : ");
            double I = sc.nextDouble();
            double FI = U / I;
             System.out.println("A Resistência (R) é: " + FI);
	}
        if (esc == 4) {
            System.out.print("Até a próxima!");
        }
        sc.close();
	}
}
