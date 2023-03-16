package comandos;

import java.util.Scanner;

public class condicionais {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("fala numero");
		int num = input.nextInt();

		if (num > 0) {
			System.out.println("positivo");
		} else if (num == 0) {
			System.out.println("0");
		} else {
			System.out.println("negativo");
		}
	}
}
