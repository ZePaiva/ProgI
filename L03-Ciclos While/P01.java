/* feito por:
 * José Miguel Pinho Paiva
 * Universidade de Aveiro
 */

import java.util.*;

public class P01 {

	public static void main(String[] args) {
		
		// declaração da variável
		double num;

		Scanner k = new Scanner(System.in);

		System.out.println("Programa para contar os números de uma lista.");
		System.out.print("\nColoca um número e depois clica em enter e podes termina inserindo um número negativo:\n\n");

		do {
			num = k.nextDouble();
		} while (num >= 0);
	}
}	