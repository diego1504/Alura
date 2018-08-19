//vamos tranformar esta classe em uma interface. Uma interface é uma classe abstrata e sem atributos concretos
//public abstract class Autenticavel  {

//outro conceito que usamos quando falamos de interface é a que vamos assinar o contrato da interface, por este motivo, 
//vamos ser obrigados a fazer os metodos setsenha e autentica
public abstract interface Autenticavel  {
	
	//private int senha; apagar o atributo senha pq é concreto
	
	
	public abstract void setSenha(int senha) ;
	//	this.senha = senha;
	

	
	
	public abstract boolean autentica(int senha) ;
	//	System.out.println("Classe Gerente - Metodo autentica");
//		if (this.senha == senha) {
	//		return true;
//		} else {
	//		return false;
	//	}
	
	
	
	

}
