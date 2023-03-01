package calculadora;

import java.util.Scanner;

public class exemplo2 {
	
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 20;
		double var3 = 3.5;
		int somavars = var1 + var2;
		String disciplina = "desenvolvimento de sistemas";
		
		System.out.println("digite o 1 numero");
		Scanner.nextint(var1);
		
		System.out.println("a soma da variavel " + var2 + " e a " + var1 + " é igual a = " + somavars);
	}
}
