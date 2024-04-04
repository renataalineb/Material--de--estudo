import java.util.Scanner;

public class negativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
      System.out.println("Quantos números você vai digitar?");
      int n = sc.nextInt();
      
      int[] vet = new int [n];
      
      for(int i = 0; i<n; i++ ) {
    	  System.out.println("Digite um número: ");
    	  vet[n]= sc.nextInt();
      }
    		  
      
      
		sc.close();
	}

}
