package lista;

import java.text.DecimalFormat;

public class exe3 {
	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("0.00");
		  
		double chicom = 1.5;
		double zem = 1.1;
		int i = 0;
		
		while(chicom > zem) {
			chicom = chicom + 0.2;
			System.out.println("chico: " + formatador.format(chicom));
			zem = zem + 0.3;
			System.out.println("ze: " + formatador.format(zem));
			System.out.println(" ");

			i = i + 1;
			
		}	
		
		System.out.println("chico: " + formatador.format(chicom));
		System.out.println("ze: " + formatador.format(zem));
		System.out.println("demora " + i + " anos para ze ficar maior que chico");
		
		
		
	}
}
