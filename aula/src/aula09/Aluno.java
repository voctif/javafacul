package heranca;


public class Aluno extends Pessoa{
	private String curso;
	private int anoIngreso;
	
	public Aluno() {}
	public Aluno(String nome, String cpf, char sexo, String curso, int anoIngreso) {
		super(nome, cpf, sexo);
		this.anoIngreso = anoIngreso;
		this.curso = curso;
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getAnoIngreso() {
		return anoIngreso;
	}
	public void setAnoIngreso(int anoIngreso) {
		this.anoIngreso = anoIngreso;
	}
	
	public String toString() {
		String str = super.toString();
		
		return str + "Aluno curso=" + curso + ", anoIngreso=" + anoIngreso ;
		
	}
	
}
