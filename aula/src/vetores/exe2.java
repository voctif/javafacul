package vetores;

import java.util.Scanner;

public class exe2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int vetor[] = new int[10];
		int num = 0, par = 0, quant =0;

		System.out.println("informe 10 num ");
		for (int i = 0; i < 10; i++) {
			vetor[i] = input.nextInt();
			;
		}
		System.out.println("fala um numero pra verificar");
		num = input.nextInt();
		
		for(int i =0; i<10; i++) {
			if(vetor[i] == num) {
				quant++;
			}
		}
		System.out.println(quant);
		
	}
}
