package lista;

public class Testealuno {
	public static void main(String[] args) {
		
		Aluno a  = new Aluno("123", "victor", 6.0, 6.0,5.0);
		
		System.out.println(a.calculaMediaPonderada());
		System.out.println(a.verificaSituacaoAluno());
		
		
	}
}
