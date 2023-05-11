package interfaces;

public class Presidente extends Funcionario{
	private String sala;
	
	public Presidente(){}
	public Presidente(String nome, String cpf, double salario, String sala){
		super(nome, cpf, salario);
		this.sala = sala;
	}
	
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public double bonificacao() {
		return getSalario() * 0.2;
	}
	
}
