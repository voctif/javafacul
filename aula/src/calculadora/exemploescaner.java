package calculadora;

import java.util.Scanner;

public class exemploescaner {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float var1;
		float var2;
		
		System.out.println("digite o distancia numero");
		var1 = input.nextFloat();
		System.out.println("digite o tempo numero");
		var2 = input.nextFloat();
		
		System.out.println("soma deu = " + (var1 + var2));
		System.out.println("subtração deu = " + (var1 - var2));
		System.out.println("divisao deu = " + (var1 / var2));
		System.out.println("multiplicaçao deu = " + (var1 * var2));
		
		System.out.println("velocidade media deu = " + (var1 / var2) + "m/s");


	}
}
