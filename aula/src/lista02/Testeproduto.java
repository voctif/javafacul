package lista;

public class Testeproduto {
	public static void main(String[] args) {

		Produto a = new Produto("victor", 1, 1000.0, 4);
		System.out.println("Estoque inicial: " + a.getQuantidade());
		System.out.println("Preco total: " + a.qProduto());
		a.vende(1.0);
		System.out.println("Estoque final: " + a.getQuantidade());
		System.out.println("Preco total: " + a.qProduto());
		a.aumenta(5);
		System.out.println("Estoque final2: " + a.getQuantidade());
		System.out.println("Preco total: " + a.qProduto());
	}
}
