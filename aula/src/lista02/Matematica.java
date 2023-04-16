package lista;

public class Matematica {
	
	
	public Integer fatorial(int num) {
		Integer soma = num;
		for(int i = 1; i < num; i++) {
			soma = soma * (num - i);
		}
		return soma;	
	}
	
	
	public double exponencial(double a, double b) {
		double soma = Math.pow(a, b);
		return soma;
	}
	public double exponencial2(double a, double b) {
		double soma = b;
		for(int i = 1; i < a; i++) {
			soma = soma * a;
		}
		return soma;
	}
	
	public Integer maior(int[] lista) {
		int m = 0;
		for(int i = 0; i < lista.length; i++) {
			if(lista[i] > m) {
				m = lista[i];
			}
		}
		return m;
		
	}
	
	
	
}
