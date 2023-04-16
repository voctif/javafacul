package lista;

public class Aluno {
	private String matricula;
	private String nome;
	private double n1;
	private double n2;
	private double nt;
	
	public Aluno() {}
	public Aluno(String matricula, String nome, double n1, double n2, double nt) {
		this.matricula = matricula;
		this.nome = nome;
		this.n1 =  n1;
		this.n2 =  n2;
		this.nt =  nt;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula =  matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getNt() {
		return nt;
	}
	public void setNt(double nt) {
		this.nt = nt;
	}
	
	
	public double calculaMediaPonderada() {
		double media = (n1 * 2.5) + (n2 * 2.5 ) + (nt * 2);
		double result = media/7;
		return result;
	}
	public Integer verificaSituacaoAluno() {
		if(calculaMediaPonderada() >= 6) {
			System.out.println("\n");
			return 1;
		}
		if(calculaMediaPonderada() >= 4 && calculaMediaPonderada() <= 5.9) {
			System.out.println("\n");
			return  2;
		}
		System.out.println("\n");
		return 3;
	}

	
}	
