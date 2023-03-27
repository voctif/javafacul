package exe6poo;

import java.util.Scanner;

public class funcionariomain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		funcionario funcionario = new funcionario();
		
		System.out.println("digite nome ");
		String nome = input.next();
		funcionario.setNome(nome);
		
		System.out.println("digite sobrenome ");
		String sobrenome = input.next();
		funcionario.setSobrenome(sobrenome);
		
		System.out.println("digite horas trabalhadas ");
		int htrab = input.nextInt();
		funcionario.setHtrab(htrab);
		
		System.out.println("digite valor hora ");
		int valorh = input.nextInt();
		funcionario.setValorh(valorh);
		
		System.out.println(funcionario.nomeCompleto());
		System.out.println(funcionario.calcularSalario());
		
		System.out.println("digite valor para incrementar ");
		int valor1 = input.nextInt();
		
		System.out.println("digite valor para incrementar ");
		int valor2 = input.nextInt();
		
		System.out.println("incremento " + funcionario.incrementarHoras(valor1));
		System.out.println("decremento " + funcionario.decrementaHoras(valor2));
		
		System.out.println("digite poercentagem para reajuste ");
		double teste = input.nextInt();
		double porcentagem = (teste/ 100);
		System.out.println(porcentagem);
		System.out.println("reajuste " + funcionario.aumentaValorHora(porcentagem));
		
		
	}
}
