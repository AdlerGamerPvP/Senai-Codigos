import java.util.Scanner;

public class dois_logs
{
	public static void main(String[] args) {
	    var sc = new Scanner(System.in);
	    
	    System.out.println("Informe seu login: ");
	        String log = sc.nextLine();
	    System.out.println("Informe sua senha: ");
	        String pass = sc.nextLine();
	    
	if ((log.equals ("atila") && pass.equals("12345")) ||
	   (log.equals ("olivi") && pass.equals("54321"))) {
	    System.out.println("Seja bem vindo!");   
	   }
    
    else {
        System.out.println("Usuário ou senha incorretos");
    }
	    
	}

}
