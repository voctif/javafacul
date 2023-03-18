package aula04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exe3 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);

		int escolha = 0;
		Integer add = 0;
		Integer remov = 0;
		Integer consult = 0;
		int mais = 0;
		int fim = 0;
		int fim2 = 0;
		int fim3 = 0;

		int acabar = 0;
		while (acabar != -1) {
			System.out.println("digite os numeros para o array: ");
			add = input.nextInt();
			acabar = add;
			if (add != -1) {
				numeros.add(add);
			}
		}

		do {
			System.out.println("escolha sua ação: ");
			escolha = input.nextInt();

			switch (escolha) {
			case 1:

				do {
					do {
						System.out.println("digite o numero que gostaria de adicionar: ");
						add = input.nextInt();
						if (add != -1) {
							numeros.add(add);
						}
					} while (add != -1);

					System.out.println("acabar? 1-sim 2-nao");
					fim = input.nextInt();

				} while (fim != 1);

				break;

			case 2:

				do {
					do {
						System.out.println("digite o numero que gostaria de deletar: ");
						remov = input.nextInt();
						if (remov != 1) {
							numeros.remove(remov);
						}
					} while (remov != -1);

					System.out.println("acabar? 1-sim 2-nao");
					fim2 = input.nextInt();

				} while (fim2 != 1);

				break;

			case 3:

				do {
					do {
						System.out.println("digite o numero que gostaria de procurar: ");
						consult = input.nextInt();
						if (consult != -1) {
							System.out.println(numeros.get(consult));
						}

					} while (consult != -1);

					System.out.println("acabar? 1-sim 2-nao");
					fim3 = input.nextInt();

				} while (fim3 != 1);

				break;

			case 4:

				int sub = 0;
				int pos = 0;

				do {
					System.out.println("digite o numero q vc quer substuitir");
					sub = input.nextInt();
					System.out.println("digite o numero da posição q vai o numero");
					pos = input.nextInt();
					System.out.println(numeros.set(pos, sub));

					System.out.println("acabar? 1-sim 2-nao");
					fim3 = input.nextInt();

				} while (fim3 != 1);

				break;

			case 5:
				int soma = 0;
				for (int i = 0; i < numeros.size(); i++) {
					System.out.println(numeros.get(i));
					soma = numeros.get(i);
					soma = soma + soma;
				}
				System.out.println("media de: " + soma / numeros.size());

				break;

			case 6:
				Collections.sort(numeros);
				System.out.println(numeros);
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: ");

			}

			System.out.println("gostaria de fazer outra coisa? 1-sim 2-nao");
			mais = input.nextInt();
		} while (mais != 2);

		System.out.println(numeros);

	}
}
