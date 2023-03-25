package exe03;

import java.util.Scanner;

public class contasmain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		contas contas = new contas();
		
		System.out.println("digite tipo ");
		String tipo = input.next();
		System.out.println("digite num conta ");
		int numconta = input.nextInt();
		System.out.println("digite num cliente");
		int numcliente = input.nextInt();
		System.out.println("digite saldo");
		int saldo = input.nextInt();
		
		System.out.println("sacar ");
		int sacar = input.nextInt();
		
		System.out.println("deposito ");
		int deposito = input.nextInt();
		
		contas.setNumcliente(numcliente);
		contas.setNumconta(numconta);
		contas.setSaldo(saldo);
		contas.setTipo(tipo);
		
		System.out.println(contas.sacar(sacar));
		System.out.println(contas.deposito(deposito));
		System.out.println(contas.imprimir());
	}
}
