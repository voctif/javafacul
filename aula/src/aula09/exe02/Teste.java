package heranca;

public class Teste {
	public static void main(String[] args) {
			
		//pessoa
		Pessoa p1 = new Pessoa();
		p1.setNome("lucas");
		p1.setEndereco("rua 1");
		p1.setNumero("1234 1235");
		
		System.out.println(p1.toString());
		
		//fornecedor
		Fornecedor f1 = new Fornecedor();
		f1.setNome("carlos");
		f1.setEndereco("rua 2");
		f1.setNumero("6565 56565");
		f1.setValorcredito(200);
		f1.setValordivida(100);
		
		System.out.println(f1.toString());
		System.out.println(f1.obterSaldo());
		
		//empregado
		
		Empregado e1 = new Empregado();
		e1.setNome("henrique");
		e1.setEndereco("rua 3");
		e1.setNumero("4566 4566");
		e1.setCodigosetor(2);
		e1.setSalariobase(1900);
		e1.setImposto(200);
		
		System.out.println(e1.salario());
		System.out.println(e1.toString());
		
		
		
	}
}
