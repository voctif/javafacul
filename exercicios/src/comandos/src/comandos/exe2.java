package comandos;

import java.util.Scanner;

public class exe2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("digite numero");
		int num = input.nextInt();

		if ((num % 2 == 0) && (num % 5 == 0)) {
			System.out.println("sim");
		} else {
			System.out.println("nao");
		}

	}
}
