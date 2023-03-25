package aula07;

import java.util.Scanner;

public class maincarro {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String tipo = input.next();
		String cor = input.next();
		String placa = input.next();
		Integer porta = input.nextInt();
		
		//carro carro = new carro();
		//carro.setTipo(tipo);
		//carro.setCor(cor);
		//carro.setPlaca(placa);
		//carro.setPorta(porta);

		
		carro teste = new carro("porshe", "branco", "123", 2);
		
		System.out.println(teste.getCor());
		System.out.println(teste.getPlaca());
		System.out.println(teste.getTipo());
		System.out.println(teste.getPorta());

	}
}
