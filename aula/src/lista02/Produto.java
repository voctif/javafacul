package lista;

public class Produto {
	private String nome;
	private int id;
	private double preco;
	private int quantidade;
	
	public Produto() {}
	public Produto(String nome, int id, double preco, int quantidade) {
		this.nome = nome;
		this.id = id;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double qProduto() {
		double total = quantidade * preco;
		return total;
	}
	public void vende(Double quantidade) {
		this.quantidade -= quantidade;
	}
	public void aumenta(int quantidade) {
		this.quantidade += quantidade;
	}
}
