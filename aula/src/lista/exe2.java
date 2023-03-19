package lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class exe2 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite um numero de 4 algorismos: ");
		String num = input.next();
		
		num.substring(0,2);
		
		Integer numero = Integer.parseInt(num.substring(0,2));
		Integer numero2 = Integer.parseInt(num.substring(2,4));
		
		int soma = numero + numero2;
		int raiz = soma*soma;
		int resultado = raiz/soma;
		
		if(resultado == soma) {
			System.out.println("é raiz");
		}else {
			System.out.println("n é");
		}
		
		
		
		
		
	}
}
