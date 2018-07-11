/* feito por:
 * José Miguel Pinho Paiva
 * Universidade de Aveiro
 */

import java.util.*;
import static java.lang.Math.*;

public class P12 {

	public static void main(String[] args) {
		
		// variáveis
		int num, secret, tentativas;
		char resposta;
		boolean ng = false;
		Scanner k = new Scanner(System.in);

		System.out.println("Jogo do adivinha o número (agora entre 0 e 100)");
		System.out.println("-----------------------------------------------");

		do {
			// obtém número secreto
			secret = (int) (random() * 100.0 + 1);
			tentativas = 0;

			// jogo
			do {
				System.out.print("\nColoque um número: ");
				num = k.nextInt();
				System.out.println();

				if (num > secret) {					
					System.out.printf("O número %d é maior do que o número escolhido.\nTenta outra vez.\n", num);
				} else if (num < secret) {					
					System.out.printf("O número %d é menor do que o número escolhido.\nTenta outra vez.\n", num);
				}
				++tentativas;
			} while(num != secret);

			// menu de reiniciar o jogo
			System.out.printf("Parabéns, ao fim de %d tentativas conseguiste acertar no número.\n", tentativas);
			System.out.print("Novo jogo (s/n)? ");
			resposta = k.next().charAt(0);

			if (resposta == 's') {				
				ng = true;			
			} else if (resposta == 'n') {				
				ng = false;
			} else {				
				System.out.print("Resposta não aceitável.\nNovo jogo (s/n)? ");
				resposta = k.next().charAt(0);
			}
		} while (ng); 
	}
}