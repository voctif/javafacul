package heranca2;

public abstract class Teste {
	public static void main(String[] args) {
		Imovel i1 = new Imovel();
		i1.setEndereco("rua 1");
		i1.setPreco(100);
		
		System.out.println(i1.toString());
		
		Novo n1 = new Novo();
		n1.setEndereco("rua 2");
		n1.setPreco(100);
		n1.setPorcentagem(10);
		System.out.println(n1.toString());
		
		Velho v1 = new Velho();
		v1.setEndereco("rua 3");
		v1.setPreco(100);
		v1.setDesconto(10);
		System.out.println(v1.toString());
		
		
	}
}
