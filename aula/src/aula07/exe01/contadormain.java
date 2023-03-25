package exe01;

import java.util.Scanner;

import aula07.exe01calculadora;

public class contadormain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valor = input.nextInt();
		contador i = new contador(20);

		System.out.println(i.zerar());
		System.out.println(i.incrementar());
		System.out.println(i.decrementar());
		System.out.println(i.somar(valor));
		System.out.println(i.subtrair(valor));

	}
}
