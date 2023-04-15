package polimorfismo;

public class Funcionario {
	private String nome;
	private String cpf;
	private Double salario;
	
	public Funcionario() {}
	public Funcionario(String nome, String cpf, Double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
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
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario =salario;
	}
	
	public Double bonificacao() {
		double por = salario * 0.1;
		return salario + por;
	}

	
}
