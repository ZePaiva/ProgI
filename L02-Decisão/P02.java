/* feito por:
 * José Miguel Pinho Paiva
 * Universidade de Aveiro
 * 21-11-2016
 */

//bibliotecas
import java.util.*;

public class P02 {

	public static void main(String[] args) {
		
		//declaração do teclado
		Scanner keyboard = new Scanner(System.in);

		//declaração das variáveis
		double num1, num2;

		System.out.print("Num1? ");
		num1 = keyboard.nextDouble();
		System.out.print("Num2? ");
		num2 = keyboard.nextDouble();

		//teste para saber se são iguais
		if (num1 == num2) {
			System.out.println("Os números inseridos são iguais.");
		} else {
		
			// maneira avançada
			// System.out.printf("O número %4.2f é o maior.\n", num1 > num2 ? num1 : num2 );		

			// maneira simples
			if (num1 > num2) {
				System.out.printf("O número %4.2f é o maior.\n", num1);
			} else {
				System.out.printf("O número %4.2f é o maior.\n", num2);
			}
		}
	}
}