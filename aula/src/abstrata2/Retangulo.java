package abstrata2;

public class Retangulo extends Forma{
	private int base;
	private int altura;
	
	public Retangulo(){}
	public Retangulo(int base, int altura){
		this.altura = altura;
		this.base = base;
	}
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	@Override
	public double Calculararea() {
		return base * altura;
	}

	@Override
	public double Calcularperimetro() {
		return (base * 2) + (altura * 2);
	}

}
