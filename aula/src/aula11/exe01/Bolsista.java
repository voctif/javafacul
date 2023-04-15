package exe01;

public class Bolsista extends Aluno{
	private double desconto;
	
	public Bolsista(){}
	public Bolsista(String nome, String registro, double valorm, double desconto) {
		super(nome,registro,valorm);
		this.desconto = desconto;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public double pagarMensalidade(int data) {
		if(data < 15) {
			return getValorm() - getValorm() *(desconto/100);
		}else {
			return getValorm();
		}
	}
}
