package exe01;

public class teste {
	public static void main(String[] args) {
		Aluno teste = new Aluno("victor", "123", 1000);
		System.out.println(teste.pagarMensalidade(5));
		
		Bolsista a = new Bolsista("lucas","2",1000, 10);
		System.out.println(a.pagarMensalidade(5));
		
		Universidade b = new Universidade();
		b.recebePagamento(a, 5);
		System.out.println(b.recebePagamento(a,5));
	}

}
