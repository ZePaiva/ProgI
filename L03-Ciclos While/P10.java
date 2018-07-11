/* feito por:
 * José Miguel Pinho Paiva
 * Universidade de Aveiro
 */

import java.util.*;

public class P10 {

	public static void main(String[] args) {
		
		// variáveis
		Scanner k = new Scanner(System.in);
		int nums, prev_num, highest, lowest;

		System.out.println("Quando quiseres terminar o programa coloca um número e o seu dobro imediatamente a seguir.");
		System.out.println("Inicio:");
		nums = k.nextInt();
		prev_num = highest = lowest = nums;

		do {
			prev_num = nums;
			nums = k.nextInt();

			// rever o mais alto
			if (nums > highest) {				
				highest = nums;

			// rever o mais baixo
			} else if (nums < lowest) {				
				lowest = nums;
			}
		} while(nums != (2 * prev_num));

		System.out.printf("O programa parou porque %d é igual ao dobro de %d, o maior número registado foi %d e o menor foi %d.\n", nums, prev_num, highest, lowest);
	}
}