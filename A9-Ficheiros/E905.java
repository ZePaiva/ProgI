import java.util.*;
import java.io.*;

public class E905 {

	public static void main(String[] args) throws IOException {
		
		String nomeEntrada;

		File aConv;
		File conv = new File("uncom.java");
		PrintWriter escritor;

		Scanner k = new Scanner(System.in);

		do {

			System.out.print("Nome do ficheiro de entrada: ");
			nomeEntrada = k.next();
		
			aConv = new File(nomeEntrada);

			if (!aConv.isFile() || !aConv.canRead()) {
				
				System.out.print("Ficheiro não aceitável, coloque outro");
			}
		} while (!aConv.isFile() || !aConv.canRead());

		Scanner inFile = new Scanner(aConv);
		escritor = new PrintWriter(conv);

		while (inFile.hasNext()) {

			String linha = inFile.nextLine();
			String imprimi = "";
		
			if (linha.charAt(0) == '/' && (linha.charAt(1) == '/' || linha.charAt(1) == '*')) {
				
				if (inFile.hasNextLine()) {
					
					inFile.nextLine();
				}
			} else {

				for (int i = 0; i < linha.length(); i++) {

					if (linha.charAt(i) == '\n') {
						
						imprimi += "\n";
					
					} else {

						imprimi += linha.charAt(i);
					}
				}	
			}
		}

		escritor.close();
		inFile.close();
	}
}