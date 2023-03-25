package exe02;

public class retangulo {
	private int l1;
	private int l2;
	
	public retangulo(){
		
	}
	
	public retangulo(int l1, int l2) {
		this.l1 = l1;
		this.l2 = l2;
	}
	
	public int getL1() {
		return l1;
	}
	public void setL1(int l1) {
		this.l1 = l1;
	}
	public int getL2() {
		return l2;
	}
	public void setL2(int l2) {
		this.l2 = l2;
	}
	
	public int calculoArea() {
		int valor = l1 * l2;
		return valor;
	}
	
	public int calculoPerimetro() {
		int valor = (l1+l1) + (l2+l2);
		return valor;
	}
	
}
