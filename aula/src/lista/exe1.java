package lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);

		int num;

		do {
			System.out.println("digite os numeros q deseja adicionar, para parar digite um numero negativo ");
			num = input.nextInt();
			if (num <= 0) {
				System.out.println("parar");
			} else {
				numeros.add(num);
			}

		} while (num >= 0);
		
		//menor numero
		Collections.sort(numeros);
		System.out.println("menor numero: " +  numeros.get(0));		
		
		//maior numero
		Collections.sort(numeros, Collections.reverseOrder());;
		System.out.println("maior numero: " + numeros.get(0));
		
		//media
		int soma = 0;
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
			soma = numeros.get(i);
			soma = soma + soma;
		}
		System.out.println("media de: " + soma / numeros.size());

	}
}
