package exe03;

public class contas {
	private String tipo;
	private int numconta;
	private int numcliente;
	private int saldo;
	
	public contas(){
		
	}
	public contas(String tipo, int numconta, int numcliente, int saldo){
		this.tipo = tipo;
		this.numconta = numconta;
		this.numcliente = numcliente;
		this.saldo = saldo;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNumconta() {
		return numconta;
	}
	public void setNumconta(int numconta) {
		this.numconta = numconta;
	}
	public int getNumcliente() {
		return numcliente;
	}
	public void setNumcliente(int numcliente) {
		this.numcliente = numcliente;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public int sacar(int saque) {
		if(saldo >= saque) {
			saque = saldo - saque;
		}
		return saque;
	}
	
	public int deposito(int deposito) {
		deposito = saldo + deposito;
		return saldo;
	}
	
	public void imprimir(int numcliente, int numconta, int saldo, String tipo) {
		this.numcliente = numcliente;
		this.numconta = numconta;
		this.saldo = saldo;
		this.tipo = tipo;
	}
}
