package comandos;

import java.util.Scanner;

public class exe5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dia;

		System.out.println("digite dia da semana");
		dia = input.nextInt();

		switch (dia) {
		case 1: {
			System.out.println("domingo");
			break;
		}
		case 2: {
			System.out.println("segunda");
			break;
		}
		case 3: {
			System.out.println("terca");
			break;
		}
		case 4: {
			System.out.println("quarta");
			break;
		}
		case 5: {
			System.out.println("quinta");
			break;
		}
		case 6: {
			System.out.println("sexta");
			break;
		}
		case 7: {
			System.out.println("sabado");
			break;
		}
		default:
			System.out.println("nao existe");
		}

	}
}
