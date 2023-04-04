package heranca;

public class Professor extends Pessoa{
	private String departamento;
	private int anoAdmissao;

	public Professor() {}
	public Professor(String nome, String cpf, char sexo, String departamento, int anoAdmissao) {
		super(nome, cpf, sexo);
		this.anoAdmissao = anoAdmissao;
		this.departamento = departamento;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getAnoAdmissao() {
		return anoAdmissao;
	}
	public void setAnoAdmissao(int anoAdmissao) {
		this.anoAdmissao = anoAdmissao;
	}
	
	public String toString() {
		return super.toString() + "Professor departamento=" + departamento + ", anoAdmissao=" + anoAdmissao;
	}
	
	
}
