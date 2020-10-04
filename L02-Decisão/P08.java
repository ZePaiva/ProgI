/* feito por:
 * José Miguel Pinho Paiva
 * Universidade de Aveiro
 * 21-11-2016
 */

//bibliotecas
import static java.lang.Math.*;
import java.util.Scanner;

public class P08 {

  //declaração do teclado
  static Scanner k = new Scanner(in);

  public static void main(String[] args) {
    
    //declaração das variáveis
    double num1, num2, num3;

    System.out.println("Coloca 3 números inteiros aleatórios:");
    System.out.print("Num 1:");
    num1 = k.nextDouble();
    System.out.print("Num 2:");
    num2 = k.nextDouble();
    System.out.print("Num 3:");
    num3 = k.nextDouble();

    // sequência de testes para organização dos números
    /*
     * sequência segue a seguinte ordem
     * -> verifica qual o menor número
     *  -> verifica qual número intermédio e o maior número com base nos que sobraram
     */
    if (num1 < num2 && num1 < num3) {
      System.out.printf("%3.0f\n", num1);
      if (num2 < num3) {
        System.out.printf("%3.0f\n%3.0f\n", num2, num3);
      } else if (num3 < num2) {
        System.out.printf("%3.0f\n%3.0f\n", num3, num2);
      }
     
    } else if (num2 < num1 && num2 < num3) {
      System.out.printf("%3.0f\n", num2);
      if (num1 < num3) {    
        System.out.printf("%3.0f\n%3.0f\n", num1, num3);    
      } else if (num3 < num1) {    
        System.out.printf("%3.0f\n%3.0f\n", num3, num1);    
      }    
    } else if (num3 < num2 && num3 < num1) {    
      System.out.printf("%3.0f\n", num3);
      if (num1 < num2) {    
        System.out.printf("%3.0f\n%3.0f\n", num1, num2);    
      } else if (num2 < num1) {    
        System.out.printf("%3.0f\n%3.0f\n", num2, num1);    
      }    
    }
  }
}
//Happy hacktoberfest
