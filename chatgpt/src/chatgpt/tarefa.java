package chatgpt;

public class tarefa {

	public static void main(String[] args) {
		// Médio: Encontrar o menor múltiplo comum de 3 e 5 menor que 50
		int numero = 1;
		while (numero % 3 != 0 || numero % 5 != 0) {
		    numero++;
		}
		System.out.println("Menor múltiplo comum de 3 e 5: " + numero);
		// Saída: Menor múltiplo comum de 3 e 5: 15

	}

}
