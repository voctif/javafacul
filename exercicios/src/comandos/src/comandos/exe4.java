package comandos;

import java.util.Scanner;

public class exe4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int salario;
		System.out.println("escreva seu salario");
		salario = input.nextInt();
		int reajuste = (salario / 100) * 5;
		System.out.println(reajuste);

		if (salario < 750) {
			int total = salario + reajuste + 100;
			System.out.println("reajuste de(1) " + total);
		} else {
			System.out.println("reajuste de(2) " + (salario + reajuste));
		}
	}
}
