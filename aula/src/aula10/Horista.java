package exercicios;

public class Horista extends Empregado{
	private int qHora;
	private double vHora;

	
	Horista() {}
	Horista(String nome, String cpf, String setor, int qHora, double vHora){
		super(nome, cpf, setor);
		this.qHora = qHora;
		this.vHora = vHora;
	}
	public int getqHora() {
		return qHora;
	}
	public void setqHora(int qHora) {
		this.qHora = qHora;
	}
	public double getvHora() {
		return vHora;
	}
	public void setvHora(double vHora) {
		this.vHora = vHora;
	}
	
	public String toString() {
		return super.toString() + "quantidade hora " + qHora + "valor hora " + vHora;
	}
}
