
public class TestaContas {

	public static void main(String[] args) {

		contaCorrente CC = new contaCorrente(7057, 50571); 
		contaPoupanca CP = new contaPoupanca(7057, 50572);
		
		CC.deposita(100);
		CP.deposita(100);
		
		CC.transfere(50, CP); //MUITO INTERESSANTE: passar um objeto como parametro
		
		System.out.println("CC: " + CC.getSaldo());
		System.out.println("CP: " + CP.getSaldo());
		
	}
}
