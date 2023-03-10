package comandos;

import java.util.Scanner;

public class exe3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int um, dois, tres, quatro;

		System.out.println("4 notas");
		um = input.nextInt();
		dois = input.nextInt();
		tres = input.nextInt();
		quatro = input.nextInt();

		int media = (um + dois + tres + quatro) / 4;

		System.out.println("media = " + media);

	}
}
