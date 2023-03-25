package aula07;

public class carro {

		private String tipo;
		private String cor;
		private String placa;
		private Integer porta;
		
		//construtor
		public carro(String tipo, String cor, String placa, Integer porta) {
			this.tipo = tipo;
			this.cor = cor;
			this.placa = placa;
			this.porta = porta;
			
		}
		
		
		
		public String getTipo() {
			return tipo;
		}
		
		public void setTipo(String tp) {
			tipo = tp;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public Integer getPorta() {
			return porta;
		}

		public void setPorta(Integer porta) {
			this.porta = porta;
		}
		
		
	
}	
