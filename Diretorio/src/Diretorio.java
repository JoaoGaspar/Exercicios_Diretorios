import java.io.File;
import java.util.Scanner;

public class Diretorio {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o Diretório: ");
		File caminho = new File(leitor.nextLine());

		System.out.println("");
		System.out.println(caminho);

		listaPastas(caminho, 0);

	}

	private static void listaPastas(File caminho, int nivel) {
		File[] sub = caminho.listFiles();
		int j = sub.length;
		for (int i = 0; i < j; i++) {
			if (sub[i].isDirectory()) {
				for (int x = 0; x <= nivel; x++){
					System.out.print(" ");
				}

				System.out.println(" -- " + sub[i].getName());
			
				listaPastas(sub[i], nivel++);
			}
		}
	}
}