package exercicios;

import java.util.Scanner;

public class exe3 {
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
		} while(!nome.equals("fim"));
		
		System.out.println(i);
		System.out.println(total);
		
	}
}
