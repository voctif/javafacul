package exercicios;

public class Empregado{
	protected String nome;
	protected String cpf;
	protected String setor;
	
	public Empregado() {}
	public Empregado(String nome, String cpf, String setor) {
		this.nome = nome;
		this.cpf = cpf;
		this.setor = setor;
	}
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
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public String toString() {
		return "nome " + nome + "cpf " + cpf + "setor " + setor;
	}
}
