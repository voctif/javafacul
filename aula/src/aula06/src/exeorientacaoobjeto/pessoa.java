package exeorientacaoobjeto;

public class pessoa {
	private String nome;
	private double idade;
	private double altura;


public String getNome() {
	return nome;
}

public void setNome(String nm) {
	nome = nm;
}

public double getIdade() {
	return idade;
}

public void setIdade(double idade) {
	this.idade = idade;
}

public double getAltura() {
	return altura;
}

public void setAltura(double altura) {
	this.altura = altura;
}

public void todos() {
	System.out.println(this.nome);
	System.out.println(this.altura);
	System.out.println(this.idade);

}




}