package matriz;

import java.util.Scanner;

public class exe1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

			int matriz[][] = new int[2][2];
			int linha=0,coluna=0;
			
			for (int i = 0; i < 2; i++) {// andando linha
					System.out.println("digite linha");
					linha = input.nextInt();
				for (int j = 0; j < 2; j++) {// andando coluna
					System.out.println("digite coluna");
					coluna = input.nextInt();
				}
			}
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.print(matriz[linha][coluna] + " ");
				}
				System.out.println();
			}
			
		}
	}
