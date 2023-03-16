package vetores;

import java.util.Scanner;

public class exe1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int vetor[] = new int[10];
		int num = 0, par = 0;

		System.out.println("informe 10 num ");
		for (int i = 0; i < 10; i++) {
			vetor[i] = input.nextInt();
			;
		}

		for (int i = 0; i < 10; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.println(vetor[i]);
			}
		}

	}

}
