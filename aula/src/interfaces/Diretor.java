package interfaces;

public class Diretor extends Gerente{
	private String filial;
	
	public Diretor(){}
	public Diretor(String nome, String cpf, double salario, String setor,String filial, int senha){
		super(nome, cpf, salario, setor, senha);
		this.filial = filial;
	}
	public String getFilial() {
		return filial;
	}
	public void setFilial(String filial) {
		this.filial = filial;
	}
	
	public double bonificacao() {
		return getSalario() * 0.18;
	}
	
	
	public boolean autentica(int senha) {
		if(getSenha() == senha) {
			return true;
		}
		return false;
	}
}
