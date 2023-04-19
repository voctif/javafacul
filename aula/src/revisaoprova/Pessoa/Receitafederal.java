package Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Receitafederal extends Pessoa {
	List<Pessoa> lista = new ArrayList<Pessoa>();

	public Receitafederal(List<Pessoa> lista) {
		this.lista = lista;
	}

	public List<Pessoa> getLista() {
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}

	public void adicionar(Pessoa pessoa) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) instanceof Pessoafisica && pessoa instanceof Pessoafisica) {
				Pessoafisica p1 = (Pessoafisica) lista.get(i);
				Pessoafisica p2 = (Pessoafisica) pessoa;
				if (p1.getCpf().equals(p2.getCpf())) {
					System.out.println("ja existe");
				} else {
					lista.add(pessoa);
				}
			} else if (lista.get(i) instanceof Pessoajuridica && pessoa instanceof Pessoajuridica) {
				Pessoajuridica a = (Pessoajuridica) lista.get(i);
				Pessoajuridica b = (Pessoajuridica) pessoa;
				if (a.getCnpj().equals(b.getCnpj())) {
					System.out.println("ja existe");
				} else {
					lista.add(pessoa);
				}
			}
		}
	}

	public void remover(String nome) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNome().equals(nome)) {
				lista.remove(i);
			}
		}
	}

	public int qfisica() {
		int cont = 0;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) instanceof Pessoafisica) {
				cont++;
			}
		}
		return cont;
	}

	public int qjuridica() {
		int cont = 0;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) instanceof Pessoajuridica) {
				cont++;
			}
		}
		return cont;
	}

	public Double retornaimposto(String nome) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNome().equals(nome)) {
				return lista.get(i).calculaimposto();
			}
		}return 0d;
	}


}
