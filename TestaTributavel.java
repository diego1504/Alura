
public class TestaTributavel {

	public static void main(String[] args) {
		
		contaCorrente cc = new contaCorrente(222, 3333) ;
		cc.deposita(100);
		
		SeguroVida seguro = new SeguroVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
			
		calc.registra(cc);
		calc.registra(seguro);
	
		
		System.out.println(calc.getValorTotalImposto());
		
		
		
	}

}
