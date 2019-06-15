package com.br.itau.Contas.Modelos;

//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }

	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		
		return "TesteConta" + super.toString();
	}
}
