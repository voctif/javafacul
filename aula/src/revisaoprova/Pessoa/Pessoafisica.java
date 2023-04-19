package Pessoa;

public class Pessoafisica extends Pessoa{
	private String cpf;
	
	//construtor
	public Pessoafisica() {}
	public Pessoafisica(String nome, String endereco, double rendabruta, String cpf) {
		super(nome, endereco, rendabruta);
		this.cpf = cpf;
	}
	//get set
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public double calculaimposto() {
		if(super.getRendabruta() <= 1400) {
			return 1;
		}else if(super.getRendabruta() >= 1400 && super.getRendabruta() <= 2100){
			double total = super.calculaimposto() - 100;
			return total;
		}else if(super.getRendabruta() >= 2100 && super.getRendabruta() <= 2800){
			return (super.getRendabruta() * 0.15 - 270);
		}else if(super.getRendabruta() >= 2800 && super.getRendabruta() <= 3600){
			return (super.getRendabruta() * 0.25 - 500);
		}else if(super.getRendabruta() >= 3600){
			return (super.getRendabruta() * 0.30 - 700);
		}else {
			System.out.println("erro");
		}
		return 0;
	}
	
}
