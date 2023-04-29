package correcao;

import java.util.ArrayList;

public class Concurso {
	private String[] listaC = new String[]{"a","a","a","a","a","a","a","a","a","a"}; 
	private ArrayList<Candidato> totalCandidato = new ArrayList<Candidato>();
	
	Concurso(){}
	Concurso(ArrayList<Candidato> totalCandidato, String[] listaC){
		this.listaC = listaC;
		this.totalCandidato = totalCandidato;
	}
	public String[] getListaC() {
		return listaC;
	}
	public void setListaC(String[] listaC) {
		this.listaC = listaC;
	}
	public ArrayList<Candidato> getTotalCandidato() {
		return totalCandidato;
	}
	public void setTotalCandidato(ArrayList<Candidato> totalCandidato) {
		this.totalCandidato = totalCandidato;
	}
	
	public void addCandidato(Candidato c) {
		for(int i =0; i< totalCandidato.size(); i++) {
			if(!totalCandidato.get(i).getCpf().equals(c.getCpf())) {
				totalCandidato.add(c);
			}
		}
	}
	
	public void removCandidato(String cpf) {
		for(int i =0; i< totalCandidato.size(); i++) {
			if(totalCandidato.get(i).getCpf().equals(cpf) ) {
				totalCandidato.remove(i);
			}else {
				
			}
		}
	}
	public void addResposta(Candidato c, String nota) {
		for(int i = 0; i <10; i++) {
			if(nota.equals("a") || nota.equals("b") || nota.equals("c") || nota.equals("d") || nota.equals("e")) {
				c.lista[i] = nota;
			}else {
				i--;
			}
		}
	}
	public int corrigirProvas(Candidato c) {
		int soma = 0;
		for(int i = 0; i < 10 ;i++) {
			if(c.lista[i] == listaC[i]) {
				soma++;
			}
		}
		return soma;
	}
	public int corrigirProva(Candidato c, String cpf) {
		int soma = 0;
		if(c.getCpf().equals(cpf)) {
			for(int i = 0; i < 10 ;i++) {
				if(c.lista[i] == listaC[i]) {
					soma++;
				}
			}
		}return soma;
	}
	public void imprimiCandidator() {
		for(int i =0; i< totalCandidato.size(); i++) {
			totalCandidato.get(i).toString();
		}

	}
}
