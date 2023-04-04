package heranca;

public class ProfessorDoutor extends Professor{
	private int anoOt;
	private String instiDout;
	
	ProfessorDoutor(){
		
	}
	ProfessorDoutor(String nome, String cpf, char sexo, String departamento, int anoAdmissao, int anoOt, String instiDout){
		super(nome, cpf, sexo, departamento, anoAdmissao);
		this.anoOt = anoOt;
		this.instiDout = instiDout;
	}
	public int getAnoOt() {
		return anoOt;
	}
	public void setAnoOt(int anoOt) {
		this.anoOt = anoOt;
	}
	public String getInstiDout() {
		return instiDout;
	}
	public void setInstiDout(String instiDout) {
		this.instiDout = instiDout;
	}
	
	public String toString() {
		return super.toString() + "ProfessorDoutor [anoOt=" + anoOt + ", instiDout=" + instiDout + "]";
	}
	
	
}
