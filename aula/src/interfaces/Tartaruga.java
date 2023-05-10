package interfaces;

public class Tartaruga implements Anda{
	private int posx;
	private int posy;
	
	Tartaruga(){}
	Tartaruga(int posx, int posy){
		this.posx = posx;
		this.posy = posy;
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
	
	public void avancar(int x, int y) {
		posx += x;
		posx -= x;

	}
	public void recuar(int x, int y) {
		posy += y;
		posy -= x;

	}

}
