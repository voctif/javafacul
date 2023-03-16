package aula4;

import java.util.Scanner;

public class exes3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite sobrenome");
		String sobrenome = input.next();
		
		int i = 0;
		String nome = null;		
		String total = " ";		

	
		System.out.println("digite nome completo");
		do {
			nome = input.nextLine();
			
			if (nome.contains(sobrenome)) {
				i = i + 1 ;
				total = nome.concat(" " + total + " " );
			}
		} while(!nome.equalsIgnoreCase("fim"));
		
		System.out.println(i);
		System.out.println(total);
		
	}
}
