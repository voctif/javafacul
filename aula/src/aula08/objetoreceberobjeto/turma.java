package objetoreceberobjeto;

public class turma {
	private String nome;
	private String turno;
	private String nomecurso;
	private int qalunos;
	private Disciplina disciplina; //nome classe e atributo 
	
	//construtor
	public turma() {
		
	}
	public turma(String nome, String turno, String nomecurso, int qalunos, Disciplina disciplina) {
		this.nome = nome;
		this.turno = turno;
		this.nomecurso = nomecurso;
		this.qalunos = qalunos;
		this.disciplina = disciplina;
	}
	
	//get and set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getNomecurso() {
		return nomecurso;
	}
	public void setNomecurso(String nomecurso) {
		this.nomecurso = nomecurso;
	}
	public int getQalunos() {
		return qalunos;
	}
	public void setQalunos(int qalunos) {
		this.qalunos = qalunos;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public String toString() {
		return "turma [nome=" + nome + ", turno=" + turno + ", nomecurso=" + nomecurso + ", qalunos=" + qalunos
				+ ", disciplina=" + disciplina + "]";
	}
	
	
	
	
	
	
}
