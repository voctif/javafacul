package vetores;

import java.util.Scanner;

public class exe3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String vetor[] = new String[10];
		String nome; 
		int quant = 0;
		
		System.out.println("informe 10 nome ");
		for (int i = 0; i < 10; i++) {
			vetor[i] = input.nextLine();
		}
		System.out.println("fala um nome pra verificar");
		nome = input.next();
		
		for(int i = 0; i<10; i++) {
			if(vetor[i].contains(nome)) {
				quant++;
			}
		}
		System.out.println(quant + nome);
	}
}