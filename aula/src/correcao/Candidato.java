package correcao;

import java.util.Arrays;

public class Candidato {

	private String nome;
	private String cpf;
	String[] lista = new String[10] ;
	
	Candidato() {}
	Candidato(String nome, String cpf, String[] lista){
		this.nome = nome;
		this.cpf = cpf;
		this.lista = lista;
	}
	
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String[] getLista() {
		return lista;
	}
	public void setLista(String[] lista) {
		this.lista = lista;
	}
	
	
	public String toString() {
		return "Candidato [nome=" + nome + ", cpf=" + cpf + ", lista=" + Arrays.toString(lista) + "]";
	}
	
	
	
	
}
