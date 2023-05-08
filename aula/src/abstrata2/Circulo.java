package abstrata2;

public class Circulo extends Forma{
	private double raio;

	@Override
	public double Calculararea() {
		return 3.14*(raio*raio);
	}

	@Override
	public double Calcularperimetro() {
		return 2*3.14*raio;
	}
	
	
}
