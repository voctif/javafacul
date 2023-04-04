package heranca;

public class Teste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("teste");
		p1.setCpf("1234242");
		p1.setSexo('F');
		
		System.out.println(p1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("teste2");
		a1.setCpf("214354353");
		a1.setSexo('m');
		a1.setCurso("ads");
		a1.setAnoIngreso(2023);
		
		System.out.println(a1.toString());
		
		Professor o1 = new Professor();
		o1.setNome("teste3");
		o1.setCpf("324234");
		o1.setSexo('f');
		o1.setDepartamento("departamento");
		o1.setAnoAdmissao(2010);
		
		System.out.println(o1.toString());
		
		ProfessorDoutor pd1 = new ProfessorDoutor();
		pd1.setNome("teste4");
		pd1.setCpf("12");
		pd1.setSexo('m');
		pd1.setDepartamento("dep");
		pd1.setAnoAdmissao(3000);
		pd1.setAnoOt(3001);
		pd1.setInstiDout("positivo");
		
		System.out.println(pd1.toString());
		
	}
}
