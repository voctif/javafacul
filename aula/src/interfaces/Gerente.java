package interfaces;

import java.util.ArrayList;

public class Gerente extends Funcionario implements Autenticavel{
	private String setor;
	private int senha;
	
	public Gerente(){}
	public Gerente(String nome, String cpf, double salario, String setor, int senha){
		super(nome, cpf, salario);
		this.setor = setor;
		this.senha =senha;
	}

	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public double bonificacao() {
		return getSalario() * 0.15;
	}
	
	@Override
	public boolean autentica(int senha) {
		ArrayList<String> setores = new ArrayList<String>();
		setores.add("vendas");
		if(this.senha == senha && setores.contains(setor)) {
			return true;
		}
		return false;
	}
	
}
