package exercicios;

import java.util.Scanner;

public class exe2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 1;
		int soma = 0;
		int i = 0;
		int media;
		
		while(num != 0) {
		System.out.println("digite numero");
		num = input.nextInt();
		if(num !=0) {
		i = i +1;
		soma += num;
		}else {
			
		}
		}
		
		media = soma/i;
		System.out.println(media);
	}
}
