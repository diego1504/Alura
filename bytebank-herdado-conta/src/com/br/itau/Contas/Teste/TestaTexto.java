package com.br.itau.Contas.Teste;

import com.br.itau.Contas.Modelos.*;

public class TestaTexto {

	public static void main(String[] args) {
		
		String nome = "Diegoo";
		System.out.println(nome);
		
		int hashnome = nome.hashCode();
		System.out.println(hashnome);
		
		int qtdnome = nome.length();
		System.out.println("tamanho: " + qtdnome);		
		
		String outronome = "Diego";
		
		int comparanome = nome.compareToIgnoreCase(outronome);
		System.out.println("Compara nome"+comparanome);
		
		ContaCorrente conta = new ContaCorrente(222, 222);
		System.out.println("To String: " + conta.toString());
		
	}

}
