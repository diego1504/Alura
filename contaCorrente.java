
public class contaCorrente extends Conta implements Tributavel {

	//ao criar esta classe o compilador ja considera com erro. O motivo disto se da por conta que apesar da heranca da classe conta o construtor não vem.
	//portanto é necessario reafirmar o construtor do objeto contacorrente
	
	
	
	public contaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	
	@Override //esta palavra é uma anotação usada para ajudar o compilador do java.
	public boolean saca(double valor) {
		double ValorTotalSaque = valor + 1; //aqui estou incluindo um valor a mais no saque
		return super.saca(ValorTotalSaque); //aqui estou aproveitando polimorfismo e heranca para usar o metodo da classe super
		
	}
	
	@Override 
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
		
	
}
}
