
public class CalculadorDeImposto {

	private double ValorTotalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		ValorTotalImposto += valor;
	
	}
	
	public double getValorTotalImposto() {
		return ValorTotalImposto;
	}
	
	
}
