package corrida; 

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite data ");
		double data = input.nextDouble();
		
		System.out.println("digite hora ");
		double hora = input.nextDouble();
		
		System.out.println("digite idade ");
		int idade = input.nextInt();
		
		Corrida corrida2 = new Corrida(data, hora);
		

		
		Pessoa corredor1 = new Pessoa("victor", 19, 1.76, 61);
		Pessoa corredor2 = new Pessoa("vitor", 20, 1.60, 62);
		Pessoa corredor3 = new Pessoa("leo", 21, 1.47, 63);
		Pessoa corredor4 = new Pessoa("gui", 23, 1.98, 64);
		Pessoa corredor5 = new Pessoa("lucas", 34, 1.32, 65);
		Pessoa corredor6 = new Pessoa("bia", 25, 1.65, 66);
		Pessoa corredor7 = new Pessoa("carlos", 26, 1.84, 67);
		Pessoa corredor8 = new Pessoa("manuel", 27, 1.86, 68);
		Pessoa corredor9 = new Pessoa("eder", 28, 1.45, 69);
		Pessoa corredor0 = new Pessoa("jhonsons", 30, 1.77, 70);
				
		Corrida corrida = new Corrida();
		corrida.adicionar(corredor0);
		corrida.adicionar(corredor1);
		corrida.adicionar(corredor2);
		corrida.adicionar(corredor3);
		corrida.adicionar(corredor4);
		corrida.adicionar(corredor5);
		corrida.adicionar(corredor6);
		corrida.adicionar(corredor7);
		corrida.adicionar(corredor8);
		corrida.adicionar(corredor9);


		corrida.idade(idade);
		corrida.imc();
		corrida.remover(corredor0);
		
		corrida2.datahora();

	
	}
}
