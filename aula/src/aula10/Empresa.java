package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	public String nome;
	public String cpf;
	public List<Empregado> lista = new ArrayList<Empregado>();
	
	public Empresa() {}
	public Empresa(String nome, String cpf, List<Empregado> lista) {
		this.nome = nome;
		this.cpf = cpf;
		this.lista = lista;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Empregado> getLista() {
		return lista;
	}
	public void setLista(List<Empregado> lista) {
		this.lista = lista;
	}
	
	
	public void adicionar(Empregado empregado) {
		lista.add(empregado);
	}
	public int qFuncionario() {
		return lista.size();
	}
	public void qfHorista() {
		int i = 0;
		for(Empregado item : lista) {
			i++;
			if(item instanceof Horista) {
				i++;
			}
		}
		System.out.println(i);
	}
	public void qfAssalariado() {
		int i = 0;
		for(Empregado item : lista) {
			if(item instanceof Assalariado) {
				i++;
			}
		}
		System.out.println(i);
	}
	
	public void gMensal() {
		double custo = 0;
		for(Empregado item : lista) {
			if(item instanceof Assalariado) {
				custo =+ ((Assalariado) item).getSalario();
			}else {
				custo =+ ((Horista) item).getqHora() * ((Horista) item).getvHora();
			}
		}
		System.out.println(custo);
	}
	
	
	
}
