package aula08;

import java.util.ArrayList;

public class inteiros {
	private ArrayList<Integer> inteiros = new ArrayList<Integer>();

	// construtor
	inteiros() {

	}

	inteiros(ArrayList<Integer> inteiros) {

	}

	// get and set
	public ArrayList<Integer> getInteiros() {
		return inteiros;
	}

	public void setInteiros(ArrayList<Integer> inteiros) {
		this.inteiros = inteiros;
	}

	// metodo adicionar
	public ArrayList<Integer> Adicionarnumero(Integer valor) {
		if (inteiros.contains(valor)) {
			System.out.println("ja existe esse valor");
		} else {
			inteiros.add(valor);
		}
		return inteiros;
	}

	// metodo remover
	public ArrayList<Integer> Removernumero(Integer valor) {
		inteiros.remove(valor);
		return inteiros;
	}

	// metodo buscar
	public ArrayList<Integer> Buscarnumero(Integer valor) {
		inteiros.get(valor);
		return inteiros;
	}

	// metodo buscar
	public int Quantidadenumero() {
		return inteiros.size();
	}

}
