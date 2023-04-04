package heranca;

public class Empregado extends Pessoa{
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	//construtor
	public Empregado() {}
	public Empregado(String nome, String endereco, String numero, int codidoSetor, double salarioBase, double imposto) {
		super(nome, endereco, numero);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	//get and set
	public int getCodigosetor() {
		return codigoSetor;
		
	}
	public void setCodigosetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	
	public double getSalariobase() {
		return salarioBase;
	}
	public void setSalariobase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double salario() {
		return this.salarioBase - this.imposto;
	}
	
	public String toString() {
		return super.toString() + " " + this.codigoSetor + " " + this.salarioBase + " " + this.imposto;
	}
}

