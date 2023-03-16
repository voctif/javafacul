package vetores;

import java.util.Scanner;

public class um {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int vetor[] = new int[10];
		int num;
		boolean achou = false;

		System.out.println("informe 10 num ");
		for (int i = 0; i < 10; i++) {
			vetor[i] = input.nextInt();
			;
		}
		System.out.println("fale um numero");
		num = input.nextInt();
		for (int i = 0; i < 10; i++) {
			if (vetor[i] == num) {
				achou = true;
				break;
			}
		}
		if(achou) {
			System.out.println("achou");
		}else {System.out.println("n achou");}
	}
}
