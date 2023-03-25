package exe01;

public class contador {
	private Integer i;

	public contador() {

	}

	public contador(int i) {
		this.i = i;
	}

	public Integer getI() {
		return i;
	}

	public void setI(Integer i) {
		this.i = i;
	}

	public int zerar() {
		i = 0;
		return i;
	}

	public int incrementar() {
		i++;
		return i;
	}

	public int decrementar() {
		i--;
		return i;
	}

	public int somar(int valor) {
		i = i + valor;
		return i;
	}

	public int subtrair(int valor) {
		i = i - valor;
		return i;
	}
}
