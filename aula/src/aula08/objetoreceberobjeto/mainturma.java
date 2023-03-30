package objetoreceberobjeto;

public class mainturma {
	public static void main(String[] args) {
		Disciplina disciplina= new Disciplina();
		disciplina.setNome("teste");
		disciplina.setNumcredito(10);
		disciplina.setImenta("eng software");
		
		turma turma = new turma();
		turma.setNome("teste");
		turma.setTurno("noite");
		turma.setNomecurso("ads");
		turma.setQalunos(10);
		turma.setDisciplina(disciplina);
		
		System.out.println(turma.toString());
		
	}
}
