
public class SistemaInterno {

	private int senha = 2222;
	
	public SistemaInterno() {
		System.out.println("Classe SistemaInterno - Construtor ");
	}
	
	public void autentica(Autenticavel g) {
	//	System.out.println("Clase Sistema Interno - Metodo Autentica");
//		System.out.println("Clase Sistema Interno - This.Senha " + this.senha);
	//	System.out.println("Clase Sistema Interno - G.senha " + g.getSenha());
		System.out.println("Classe SistemaInterno - Autentica");
			boolean autenticou = g.autentica(this.senha);
		if (autenticou) {
			System.out.println("Pode entrar!");
			
		}else {
			System.out.println("Não pdde entrar!!");
		}
			
	}



}
