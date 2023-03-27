package exe6poo;

public class funcionario {
	private String nome;
	private String sobrenome;
	private int htrab;
	private double valorh;

	// construtor
	public funcionario() {
	}

	public funcionario(String nome, String sobrenome, int htrab, int valorh) {

		// get and set
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getHtrab() {
		return htrab;
	}

	public void setHtrab(int htrab) {
		this.htrab = htrab;
	}

	public double getValorh() {
		return valorh;
	}

	public void setValorh(int valorh) {
		this.valorh = valorh;
	}

	// funçoes
	public String nomeCompleto() {
		return this.nome + this.sobrenome;
	}

	public double calcularSalario() {
		//System.out.println("salario: " + (htrab * valorh));
		return this.htrab * this.valorh;
	}

	public double incrementarHoras(int valor) {
		valorh = valorh + valor;
		return valorh;
	}

	public double decrementaHoras(int valor) {
		valorh = valorh - valor;
		return valorh;

	}

	public double aumentaValorHora(double porcentagem) {
		valorh = valorh + (valorh * porcentagem);
		return valorh;
	}

}
