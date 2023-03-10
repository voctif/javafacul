package comandos;

import java.util.Scanner;

public class exe7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		//while(num <=10) {
		//	System.out.println(num);
		//	num += 1;
		//}
		
		System.out.println("do while");
		do {
			System.out.println(num);
			num += 1;
		}while(num <= 10);
		
		
	}
}
