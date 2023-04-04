 package heranca;

public class Pessoa {
	protected String nome;
	protected String cpf;
	protected char sexo;
	
	public Pessoa(){
		
	}
	public Pessoa(String nome, String cpf, char sexo) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
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
	
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public String toString() {
		String str = "nome " + nome + "cpf " + cpf + "sexo " + sexo ;
		return str;
	}
	
		
}
