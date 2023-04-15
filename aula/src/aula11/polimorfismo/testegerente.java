package polimorfismo;

public class testegerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente("joao", "123", 1000d, "adm");
		System.out.println(gerente.bonificacao());
		
		Funcionario funcionario = new Funcionario("pedro","123",1000d);
		System.out.println(funcionario.bonificacao());
		
		
 
		Controlegasto cg = new Controlegasto();
		
		cg.addGasto(gerente);
		cg.addGasto(funcionario);


		System.out.println("gasto " + cg.getTotalg());
		
	}
				
}
