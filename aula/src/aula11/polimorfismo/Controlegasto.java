package polimorfismo;

public class Controlegasto {
	private double totalg =0;

	public double getTotalg() {
		return totalg;
	}

	public void setTotalg(Double totalg) {
		this.totalg = totalg;
	}
	
	public void addGasto(Funcionario f) {
		totalg += f.bonificacao();
	}
}	
