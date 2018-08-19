//quando estamos assinando o contrato de uma interface usamos a palavra implements para fazer referencia
public class Cliente implements Autenticavel {

	
	private AutenticadorUtil autenticador;
	
	public Cliente() {
		autenticador = new AutenticadorUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);
		
		
	}

}
