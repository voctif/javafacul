package interfaces;

import java.util.Scanner;

public class Controlefinanceiro {
	public void login(Autenticavel a) {
		Scanner input = new Scanner(System.in);
		System.out.println("diga senha");
		int senha = input.nextInt();
		
		if(a.autentica(senha) == true) {
			System.out.println("logado");
		}else {
			System.out.println("nao entrou");
		}
	}
}
