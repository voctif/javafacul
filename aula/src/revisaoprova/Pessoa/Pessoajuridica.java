package Pessoa;

public class Pessoajuridica extends Pessoa{
	private String cnpj;
	
	public Pessoajuridica() {}
	public Pessoajuridica(String nome, String endereco, double rendabruta, String cnpj) {
		super(nome, endereco, rendabruta);
		this.cnpj = cnpj;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public double calculaimposto() {
		return super.calculaimposto();
	}
}
