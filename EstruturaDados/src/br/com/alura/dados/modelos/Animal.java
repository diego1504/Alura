package br.com.alura.dados.modelos;

public class Animal {

	private String nome;
	private String raca;
	private int idade;

	
	public String getRaca() {
		return raca;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public Animal (String nome, String raca, int idade) {
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		
		return "Nome: " + this.nome + " " + "Idade: " + this.idade; 
	}
	
	
	public String faseVida (int idade) {
		
		String faseDaVida = " ";
		
		if (idade <= 2) {
			faseDaVida = "Bebe";
		}
				
		if (idade >= 3 && idade <= 8) {
			faseDaVida = "Adulto";
		}
	
		if (idade >= 9) {
			faseDaVida = "Velhinho";
		}
	
		return faseDaVida;
	}
	
	@Override
	public boolean equals(Object obj) {
		Animal ref = (Animal) obj;
		if (this.nome != ref.nome) {
			return false;
		} else {
			return true;
		}
	}
	
}
