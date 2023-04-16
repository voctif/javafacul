package lista;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Matematica a = new Matematica();
		
		System.out.println("Tamanho da lista: ");
		Integer tamanhoLista = scanner.nextInt();
		
		int[] lista = new int[tamanhoLista];
		for(int i = 0; i < lista.length; i++) {
			System.out.println("Valores: ");
			Integer item = scanner.nextInt();
			lista[i] = item;
		}
		
		System.out.println("Maior número do vetor: " + a.maior(lista)); 
	}
}
