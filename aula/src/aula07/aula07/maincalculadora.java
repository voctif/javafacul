package aula07;

import java.util.Scanner;

public class maincalculadora {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// metodo privado
		exe01calculadora x = new exe01calculadora();
		exe01calculadora f = new exe01calculadora();

		System.out.println("digite x");
		int x2 = input.nextInt();
		System.out.println("digite y");
		int y2 = input.nextInt();

		x.setX(x2);
		x.setY(y2);

		System.out.println("num " + x.getX());
		System.out.println("num " + x.getY());

		System.out.println("digite oq vc quer fazer ");
		String funcao = input.next();
		f.setF(funcao);

		if (funcao.equalsIgnoreCase("soma")) {
			System.out.println(x.soma());
		} else if (funcao.equalsIgnoreCase("subtracao")) {
			System.out.println(x.subtracao());
		} else if (funcao.equalsIgnoreCase("multiplicacao")) {
			System.out.println(x.multiplicacao());
		} else if (funcao.equalsIgnoreCase("divisao")) {
			System.out.println(x.divisao());
		} else {
			System.out.println("bruh");
		}
		;

	}
}
