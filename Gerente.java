
public class Gerente extends Funcionario implements Autenticavel{

	
	private AutenticadorUtil autenticador;
	
	public Gerente() {
		System.out.println("Classe Gerente - Dentro do Construtor");
		autenticador = new AutenticadorUtil();
	}
	
	
	@Override //informar que existe reescrita de metodos
	public double getBonificacao() {
	    return super.getSalario() * 0.1;
	}

	@Override
	public void setSenha(int senha) {
		System.out.println("Classe Gerente - setSenha");
		this.autenticador.setSenha(senha);
		//	this.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		System.out.println("Classe Gerente - autentica");
		return this.autenticador.autentica(senha);

		
		
	}
	
	
	
	

}
	
	

