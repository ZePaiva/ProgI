import java.io.*;
import java.util.*;

public class E906{

	public static void main(String[] args) throws IOException {
		
		File entrada = new File(args[0]);
		File exit = new File(args[1]);

		if (exit.exists()) {
		
			System.out.println("O ficheiro para escrita já existe.\nO programa vai ser terminado.");
			return;
		
		} else if (!entrada.exists()) {
		
			System.out.println("O ficheiro de entrada não existe.\nO programa vai ser terminado.");
			return;

		} else if (!entrada.isFile()) {
			
			System.out.printf("%s não é ficheiro.\n", args[0]);
			return;
		
		} else if (!entrada.exists()) {
			
			System.out.printf("%s não é possível de ler.\n", args[0]);
			return;

		} else if (entrada.exists()) {
			
			Scanner k = new Scanner(entrada);
			
			if (!entrada.canRead()) {
				
				System.out.printf("%s não é possível de ler.\n", args[0]);
				return;
			}

			k.close();
			
		} else if (!exit.exists() && entrada.canRead()) {

			exit.createNewFile();

			Scanner kfile = new Scanner(entrada);
			PrintWriter rit = new PrintWriter(exit);

			while (kfile.hasNext()) {

				String linha = kfile.next();

				rit.println(linha);
			}

			kfile.close();
			rit.close();
		}
	}
}