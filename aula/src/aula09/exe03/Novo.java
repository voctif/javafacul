package heranca2;

public class Novo extends Imovel{
	public double porcentagem;
	
	//construtores
	Novo(){}
	Novo(String endereco, double preco, double porcentagem){
		super(endereco, preco);
		this.porcentagem = porcentagem;
	}
	
	public double getPorcentagem() {
		return porcentagem;
	}
	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem ;
	}
	
	public double valorN() {
		double preco = this.getPreco() * (porcentagem /100) ;
		double result = preco + this.getPreco();
		return result;
	}
	
	public String toString() {
		return super.toString() +"" + valorN() + " " + this.porcentagem;
	}
	
	
	 
}
