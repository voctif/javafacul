package abstrata;

public class Diretor extends Gerente{
	private String filial;
	
	public Diretor(){}
	public Diretor(String nome, String cpf, double salario, String setor,String filial){
		super(nome, cpf, salario, setor);
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
}
