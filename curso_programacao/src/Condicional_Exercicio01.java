import java.util.Scanner;

public class Condicional_Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int x = sc.nextInt();
		
		
		if (x < 0) {
			System.out.println("NEGATIVO");
		}
		
		else {
		    	 System.out.println("NÃO NEGATIVO");
		     }
				
		sc.close();

	}

}
