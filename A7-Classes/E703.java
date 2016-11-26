import java.util.*;
import static java.lang.Math.*;

public class E703 {

	static Scanner k = new Scanner(System.in);

	//registo dos dados, global
	static Statistics lista = new Statistics();


	public static void main(String[] args) {
	
		double num;

		System.out.println("Quando quiser terminar o programa apenas faça Ctrl+D (EOF).");

		while(k.hasNextLine()){

			System.out.print("Número: ");
			num = k.nextDouble();

			updateStats(num);

		}

		System.out.printf("Mínimo da lista: %4.2f\nMaximo da Lista: %4.2f\nMédia da lista: %4.2f\n", lista.min, lista.max, mean());
		System.out.printf("Números na lista: %3d\nSomatório da lista: %6.2f\nSomatório dos quadrados: %7.2f\n", lista.count, lista.sum, lista.sqsum);
		System.out.printf("Variância da lista: %4.2f\n", variance());
	}

	//função que dá update dos stats da lista
	public static void updateStats(double num) {

		//renova o minimo se necessario
		if (num > lista.max) {
			
			lista.max = num;
		
		//renova o maximo se necessario
		} else if (num < lista.min) {
			
			lista.min = num;

		}

		//renova o contador da lista
		lista.count += 1;

		//renova o somatorio da lista
		lista.sum += num;

		//renova o somatorio dos quadrados da lista
		lista.sqsum += pow(num, 2);

	}

	//modulo pra calculo da media
	public static double mean() {

		double media = lista.sum / lista.count;

		return media;
	}

	//modulo pra calculo da variancia
	public static double variance() {

		double variancia = lista.sum / (lista.count - pow(mean(), 2));

		return variancia;
	}


}

class Statistics {

	double min = 0;
	double max = 0;
	int count = 0;
	double sum = 0;
	double sqsum = 0;
}