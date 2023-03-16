package aula4;

import java.util.Scanner;

public class exes{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("digite um numero");
		int num = input.nextInt();
		int soma = 0;
		int i;

		for (i = 0; i <= num; i +=2 ) {
				soma += i;
		}

		System.out.println(soma);
		// 10 0 2 4 6 8 = 20
	}
}

