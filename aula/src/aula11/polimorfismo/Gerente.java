package polimorfismo;

public class Gerente extends Funcionario	{
	private String setor;
	
	public Gerente() {}
	public Gerente(String nome, String cpf, Double salario, String setor) {
		super(nome,cpf,salario);
		this.setor = setor;
	}
	public String getSetor() {
		return setor;
	}	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public Double bonificacao(){
		Double bon = super.getSalario()* 0.15;
		return bon + super.getSalario();
	}
	
	
}
