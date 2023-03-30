package objetoreceberobjeto;

public class Disciplina {
	private String nome;
	private int numcredito;
	private String imenta;

	//construtor
	public Disciplina() {

	}

	public Disciplina(String nome, int numcredito, String imenta) {
		this.nome = nome;
		this.numcredito = numcredito;
		this.imenta = imenta;
	}
	
	//get and set
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumcredito() {
		return numcredito;
	}
	public void setNumcredito(int numcredito) {
		this.numcredito = numcredito;
	}
	
	public String getImenta() {
		return imenta;
	}
	public void setImenta(String imenta) {
		this.imenta = imenta;
	}
	
	public String toString() {
		return "disciplina [nome=" + nome + ", numcredito=" + numcredito + ", imenta=" + imenta + "]";

	}


}