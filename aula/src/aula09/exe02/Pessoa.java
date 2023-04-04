package heranca;

public class Pessoa {
	private String nome;
	private String endereco;
	private String numero;
	
	//contrutores
	public Pessoa() {}
	public Pessoa(String nome, String endereco, String numero) {
		this.nome = nome;
		this.endereco = endereco;
		this.numero = numero;
	}
	
	
	//get and set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String toString() {
		return this.endereco +" "+ this.nome +" "+ this.numero;
	}
	
}
