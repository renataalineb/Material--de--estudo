import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, h;
		double v, sal;
		
		n = sc.nextInt();
		h = sc.nextInt();
		v = sc.nextDouble();
		
		sal = v * h;
		
		System.out.println("NUMBER = " + n);
		System.out.printf("SALARY = U$  %.2f%n", sal);
		
		sc.close();
				
	}

}
