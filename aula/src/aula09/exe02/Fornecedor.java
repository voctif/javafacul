package heranca;

public class Fornecedor extends Pessoa{
	private int valorCredito;
	private int valorDivida;
	
	
	//construtores
	public Fornecedor() {}
	public Fornecedor(String nome, String endereco, String numero, int valorCredito, int valorDivida) {
		super(nome, endereco, numero);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	//get and set
	
	public int getValorcredito() {
		return valorCredito;
	}
	public void setValorcredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}
	
	public int getValordivida() {
		return valorDivida;
	}
	public void setValordivida(int valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public int obterSaldo() {
		return this.valorCredito - this.valorDivida;
	}
	
	public String toString() {
		return super.toString() + " " + this.valorCredito + " " + this.valorDivida;
	}

}
