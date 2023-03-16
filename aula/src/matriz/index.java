package matriz;

import java.util.Scanner;

public class index {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int matriz[][] = new int[3][3];
		// preenchendo coluna
		for (int i = 0; i < 3; i++) {// andando linha
			for (int j = 0; j < 3; j++) {// andando coluna
				matriz[i][j] = i + j;
			}
		}
		// imprimindo matriz
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
