package orientacaobjeto;

public class maincarro {
	public static void main(String[] args) {
		carro c1 = new carro();
		c1.tipo = "ferrari";
		c1.cor = "vermelho";
		c1.placa = "fsdfsd";
		c1.porta = 2;
		
		System.out.println("carro " + c1.tipo);
		c1.liga();
		c1.desliga();
		c1.acelara();
		c1.freia();
		System.out.println(" ");
		
		//metodo privado
		carroprivado c2 = new carroprivado();
		c2.setTipo("ferrari");
		c2.setCor("ferrari");
		c2.setPlaca("ferrari");
		c2.setPorta(2);
		
		System.out.println("tipo " + c2.getTipo());
		System.out.println("cor " + c2.getCor());
		System.out.println("placa " + c2.getPlaca());
		System.out.println("porta " + c2.getPorta());




	}
}
