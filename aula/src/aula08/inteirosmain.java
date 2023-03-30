package aula08;

import java.util.Scanner;

public class inteirosmain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		inteiros inteiros = new inteiros();
		String continuar;
		int swi = 0;
		
		do {
			System.out.println("quer qual operação ");
			swi = input.nextInt();
			
			switch (swi) {
			case 1: {
				do {
					System.out.println("digite o numero");
					Integer valor = input.nextInt();
					System.out.println(inteiros.Adicionarnumero(valor));

					System.out.println("quer continuar");
					continuar = input.next();
					
				} while (continuar.equalsIgnoreCase("sim"));
				break;
			}
			case 2: {
				do {
					System.out.println("digite o numero");
					Integer valor = input.nextInt();
					System.out.println(inteiros.Removernumero(valor));

					System.out.println("quer continuar");
					continuar = input.next();
				} while (continuar.equals("sim"));
				break;
			}
			case 3: {
				do {
					System.out.println("digite o numero");
					Integer valor = input.nextInt();
					System.out.println(inteiros.Buscarnumero(valor));

					System.out.println("quer continuar");
					continuar = input.next();
				} while (continuar.equals("sim"));
				break;
			}
			case 4: {
				System.out.println(inteiros.Quantidadenumero());
				break;
			}
			default:

			}
			System.out.println("quer fazer outra operaçao");
			continuar = input.next();
		}while(continuar.equals("sim"));


	}
}
