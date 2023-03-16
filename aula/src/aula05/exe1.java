package aula05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exe1 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite numeros");
		Integer num = 0;
		num = input.nextInt();
		
		while (num != -1) {

			if (numeros.contains(num)) {
				System.out.println("ja existe");
			} else {
				numeros.add(num);
			}
			num = input.nextInt();
		}
		Collections.sort(numeros);
		System.out.println(numeros.toString());
	}
}
