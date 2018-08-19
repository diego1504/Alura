
public class Administrador extends Funcionario implements Autenticavel {

	
	private AutenticadorUtil autenticador;
	
	public Administrador() {
		autenticador = new AutenticadorUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		//	this.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);

		
		
	}
	
	
}
