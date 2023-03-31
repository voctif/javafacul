package corrida;

import java.util.ArrayList;

public class Corrida {
	private double data;
	private double hora;
	private ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();
	
	public Corrida() {
		
	}
	public Corrida(double data, double hora, ArrayList<Pessoa> pessoa) {
		this.data = data;
		this.hora = hora;
		this.pessoa = pessoa;
	}
	
	public Corrida(double data, double hora) {
		this.data = data;
		this.hora = hora;
	}
	
	//get e set
	public double getData() {
		return data;
	}
	public void setData(double data) {
		this.data = data;
	}
	public double getHora() {
		return hora;
	}
	public void setHora(double hora) {
		this.hora = hora;
	}
	
	public ArrayList<Pessoa> getPessoa() {
		return pessoa;
	}
	public void setPessoa(ArrayList<Pessoa> pessoas) {
		this.pessoa = pessoas;
	}
	
	public Pessoa adicionar(Pessoa pessoas) {
		if(pessoa.contains(pessoas)) {
			System.out.println("existe");
		}else {
			pessoa.add(pessoas);
		}
		return pessoas;

	}
	
	
	public void idade(Integer idade) {
		int i = 0;
		for(Pessoa itens : pessoa) {
			if(itens.getIdade() > idade) {
				i++;
			}
		}
		System.out.println(i);
		return;

	}
	
	public void imc() {
		int i = 0;
		for(Pessoa itens : pessoa) {
			double peso = itens.getPeso();
			double altura = itens.getAltura();
			double imc = peso/(altura * altura);
			if(imc <= 18.5 && imc >= 24.9 ) {
				System.out.println("fora do imc entre 18,5 e 24,9");
			}else {
				i++;
				System.out.println(i);
				return;
			}
				
		}
	}
	
	public void remover(Pessoa pessoas) {
		System.out.println(	pessoa.remove(pessoas));
	}
	
	public void datahora() {
		System.out.println("data " + this.data);		System.out.println("hora " + this.hora);
	}
	
	
}
