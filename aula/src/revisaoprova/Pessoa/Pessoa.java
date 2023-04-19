package Pessoa;

public class Pessoa {
	private String nome;
	private String endereco;
	private double rendabruta;
	
	//construtor
	public Pessoa(){}
	public Pessoa(String nome, String endereco, double rendabruta){
		this.nome = nome;
		this.endereco = endereco;
		this.rendabruta = rendabruta;
	}
	//get set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getRendabruta() {
		return rendabruta;
	}
	public void setRendabruta(double rendabruta) {
		this.rendabruta = rendabruta;
	}
	
	public double calculaimposto() {
		double imposto = this.rendabruta * 0.1;
		return imposto;
	}

}
