package corrida;

public class Pessoa {
	private String nome;
	private Integer idade;
	private double peso;
	private double altura;
	
	Pessoa(){
		
	};
	Pessoa(String nome, Integer idade, double peso, double altura){
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	};
	
	//get set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	public void serAltura(double altura) {
		this.altura =altura;
	}
	
	
}
