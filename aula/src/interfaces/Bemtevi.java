package interfaces;

public class Bemtevi implements Anda,Voar {
	private int posx;
	private int posy;
	private int altura;
	
	Bemtevi(){}
	Bemtevi(int posx, int posy, int altura){
		this.posx = posx;
		this.posy = posy;
		this.altura =altura;
	}

	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getPosx() {
		return posx;
	}
	public void setPosx(int posx) {
		this.posx = posx;
	}
	public int getPosy() {
		return posy;
	}
	public void setPosy(int posy) {
		this.posy = posy;
	}

	
	public void subir(int altura) {
		this.altura += altura;
	}

	public void descer(int altura) {
		this.altura -= altura;		
	}

	public void avancar(int x, int y) {
		posx += x;
		posx -= x;		
	}

	public void recuar(int x, int y) {
		posy += y;
		posy -= x;		
	}

}
