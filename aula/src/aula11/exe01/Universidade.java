package exe01;

public class Universidade extends Aluno{
	private double total = 0;
	
	Universidade(){}
	Universidade(double total){
		super();
		this.total =total;
	}
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
	public Double recebePagamento(Aluno a, int data) {
		double totalRecebido = a.pagarMensalidade(data);
		this.total += totalRecebido;
		return total;
	}
}
