
public class AutenticadorUtil {

	private int senha;

	public AutenticadorUtil() {
		System.out.println("Classe AutenticadorUtil - Dentro do Construtor");
	}
	
	public void setSenha(int senha) {
		System.out.println("Classe AutenticadorUtil - setSenha");
		this.senha = senha;
		
	}

	
	public boolean autentica(int senha) {
		System.out.println("Classe AutenticadorUtil - autentica");
		if (this.senha == senha) {
			return true;
		} else
			return false;




}
}
