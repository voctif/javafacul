package heranca2;

public class Velho extends Imovel{
	private double desconto;

	
	//construtor
	public Velho() {}
	public Velho(String endereco, double preco, double desconto) {
		super(endereco, preco);
		this.desconto = desconto;
	}
	
	//get e set
	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public double valorD() {
		double preco = (desconto /100) * this.getPreco() ;
		double result =this.getPreco() - preco;
		return result;
	}
	
	public String toString() {
		return super.toString() +" " + valorD() + " " + this.desconto;
	}
	
	
}
