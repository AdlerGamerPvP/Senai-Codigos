import java.util.Scanner;

public class black_friday
{
	public static void main(String[] args) {
	    var sc = new Scanner(System.in);
	    
	    System.out.println("Informe o preco do produto: ");
	        Double preco = sc.nextDouble();
	    System.out.println("Informe a forma de pagamento: ");
	        int man = sc.nextInt();
	    
	if (man == 1) {
	    double desc1 = 10;
	    double V1 = preco - (preco * desc1 / 100);
	    System.out.println("O valor com desconto é de "+ V1);
	   }
    else if (man == 2) {
	    double desc2 = 5;
	    double V2 = preco - (preco * desc2 / 100);
	    System.out.println("O valor com desconto é de "+ V2);
	   }   
    else if (man == 3) {
	    double desc3 = 3;
	    double V3 = preco - (preco * desc3 / 100);
	    System.out.println("O valor com desconto é de "+ V3);
	   }
    else if (man == 4) {
	    double desc4 = 7.5;
	    double V4 = preco - (preco * desc4 / 100);
	    System.out.println("O valor com desconto é de "+ V4);
       }
	   
	}

}
