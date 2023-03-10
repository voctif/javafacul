package comandos;

import java.util.Scanner;

public class exe6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("digite graus celsius ");
		double celsius = input.nextDouble();

		System.out.println("digite a conversao 1-kelvin, 2-reaumur, 3-rankine, 4-fahrenheit");
		int conversao = input.nextInt();

		switch (conversao) {
		case 1: {

			double kel = celsius + 273.15;
			System.out.println("fahrenheit " + kel);
			break;
		}
		case 2: {

			double reu = celsius * 0.8;
			System.out.println("fahrenheit " + reu);
			break;
		}
		case 3: {

			double ran = celsius * 1.8 + 459.67;
			System.out.println("fahrenheit " + ran);
			break;
		}
		case 4: {
			double f = celsius * 1.8 + 32;
			System.out.println("fahrenheit " + f);
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + conversao);
		}
	}
}
