package exe01;

public class Aluno {
	private String nome;
	private String registro;
	protected double valorm;
	
	private int data;
	
	public Aluno() {}
	public Aluno(String nome, String registro, double valorm) {
		this.nome = nome;
		this.registro = registro;
		this.valorm = valorm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public double getValorm() {
		return valorm;
	}
	public void setValorm(double valorm) {
		this.valorm = valorm;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	public double pagarMensalidade(int data) {
		if(data <=5) {
			return valorm - (valorm*0.05);
		}else if(data >= 10) {
			return valorm - (valorm*0.1);
		}else {
			return valorm;
		}
	}

}
