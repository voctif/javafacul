package interfaces;

public class Teste {
	public static void main(String[] args) {
		Gerente a = new Gerente("victor", "123", 1000, "vendas", 123);
		Controlefinanceiro c = new Controlefinanceiro();
		c.login(a);
	}
}
