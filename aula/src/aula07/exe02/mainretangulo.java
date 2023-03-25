package exe02;

import java.util.Scanner;

public class mainretangulo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		retangulo retangulo = new retangulo();
		
		System.out.println("digite valor 1");
		int l1 = input.nextInt();
		System.out.println("digite valor 2");
		int l2 = input.nextInt();
		
		retangulo.setL1(l1);
		retangulo.setL2(l2);
		
		System.out.println(retangulo.calculoArea());
		System.out.println(retangulo.calculoPerimetro());
		

	}
}
