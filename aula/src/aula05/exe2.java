package aula05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exe2 {
	public static void main(String[] args) {
		ArrayList<String> completo = new ArrayList<String>();

		Scanner input = new Scanner(System.in);
		String nome = "";
		String solicitar = "";

		System.out.println("digite nomes");

		while (!nome.equals("fim")) {
			nome = input.nextLine();
			completo.add(nome);
		}

		System.out.println("solicitar nome");
		solicitar = input.nextLine();

		for (Integer i = 0; i < completo.size(); i++) {
			if(completo.get(i).contains(solicitar)) {
				System.out.println(i);
			}
		}

	}
}
