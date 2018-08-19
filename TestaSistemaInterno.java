
public class TestaSistemaInterno {

	public static void main(String[] args) {
		System.out.println("Main Class - Inicio do Processamento ");
		Gerente g = new Gerente();
		g.setSenha(2222);
		
	
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		
		
		
		

	}

}
