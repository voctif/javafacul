package correcao;

import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Candidato c1 = new Candidato();
		Concurso d1 = new Concurso();
		
		String nota = null;
		
		c1.setNome("victor");
		c1.setCpf("123");
		for(int i = 0; i <10; i++) {
			nota = input.next();
			if(nota.equals("a") || nota.equals("b") || nota.equals("c") || nota.equals("d") || nota.equals("e")) {
				c1.lista[i] = nota;
			}else {
				i--;
			}
		}
		System.out.println(c1.toString());
		
		System.out.println(d1.corrigirProvas(c1));

	}
}

