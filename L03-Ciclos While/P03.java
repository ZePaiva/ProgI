/* feito por:
 * José Miguel Pinho Paiva
 * Universidade de Aveiro
 */

import static java.lang.Math.*;
import java.util.*;

public class P03 {

	public static void main(String[] args) {
		
		// variáveis
		double first_num, nums, avg, lower, higher, count;
		Scanner k = new Scanner(in);

		System.out.println("Programa para calcular a média de x números.");
		System.out.println("--------------------------------------------");
		System.out.println("Coloque os números que quiser para calcular a média e descubrir qual é o maior e o menor");
		first_num = k.nextDouble();
		avg = first_num;
		lower = first_num;
		higher = first_num;
		count = 1;

		//como calcular a média, o mais alto, o mais baixo e a quantidade de números
		do {
			nums = k.nextDouble();
			// corrige o maior se necessário
			if (nums > higher) {
				higher = nums;
			}
			// corrige o menor se for necessário
			if (nums < lower) {
				lower = nums;
			}

			// auxiliares de cálculo da média 
			avg += nums;
			count++;

		} while (nums != first_num);

		// média 
		avg = avg / count;

		System.out.println("O número mais alto é " + higher + " e o número mais baixo é " + lower + " e a média é " + avg + ".");
	}
}