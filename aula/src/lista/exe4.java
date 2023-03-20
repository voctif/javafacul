package lista;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Scanner;

public class exe4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0");

		double massai = 0;
		double massaf = 0;

		int i = 0;

		System.out.println("digite a massa do objeto: ");
		massaf = input.nextDouble();
		massai = massaf;

		while (massaf > 0.5) {
			massaf = massaf - 0.5;
			i = i + 1;
		}

		double tempo = i * 50;
		double resto = tempo % 3600;

		double hora = tempo / 3600;
		double minutos = resto / 60;
		double segundos = resto % 60;

		System.out.println("massa inicial: " + massai);
		System.out.println("massa final: " + massaf);
		System.out.println("tempo em horas minutos e segundos: " + formatador.format(hora) + " "
				+ formatador.format(minutos) + " " + formatador.format(segundos));

	}
}
