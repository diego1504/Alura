package com.br.itau.Contas.Teste;

import com.br.itau.Contas.Modelos.*;


public class TesteContas {

	public static void main(String[] args) {
					
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		cc.saca(200);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		Cliente cliente = new Cliente();
		cliente.setNome("Diego Maciel");
		cliente.setCpf("222222222222");
		cc.setTitular(cliente);
		
		System.out.println(cc.getTitular().getNome());
		System.out.println(cc.getTitular());

		cc.saca(500);
		
	}

}
