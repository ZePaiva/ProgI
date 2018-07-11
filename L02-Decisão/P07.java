/* feito por:
 * José Miguel Pinho Paiva
 * Universidade de Aveiro
 * 21-11-2016
 */

//bibliotecas
import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.*;

public class P07 {

  //declaração do teclado
  static Scanner k = new Scanner(in);

  public static void main(String[] args) {
    
    //declaração das variáveis
    double num1, num2, num3;

    System.out.println("Algoritmo tipo bubblesort.");
    System.out.println("--------------------------");
    System.out.println("Coloca 3 números inteiros aleatórios:");
    System.out.print("Num 1:");
    num1 = k.nextDouble();
    System.out.print("Num 2:");
    num2 = k.nextDouble();
    System.out.print("Num 3:");
    num3 = k.nextDouble();

    //sequência de testes não rentável mas único possível neste caso
    if (num1 > num2 && num1 > num3) {
      System.out.printf("O número %.0f é o maior dos três números colocados.\n", num1);
    } else if (num2 > num1 && num2 > num3) {
      System.out.printf("O número %.0f é o maior dos três números colocados.\n", num2);
    } else if (num3 > num1 && num3 > num2) {
      System.out.printf("O número %.0f é o maior dos três números colocados.\n", num3);
    } else {
      System.out.println("Não dá para definir um número mais alto dos números colocados.");
    }

    // maneira avançada
/*    System.out.printf("%s", (num1 == num2 || num2 == num3) ? "Não dá para definir um número mais alto dos números colocados.\n" : 
      num1 > num2 && num1 > num3 ? "O número " + num1 + " é o maior dos três números colocados.\n" : 
      num2 > num1 && num2 > num3 ? "O número " + num2 + " é o maior dos três números colocados.\n" : 
      "O número " + num3 + " é o maior dos três números colocados.\n");
*/
  }
}
