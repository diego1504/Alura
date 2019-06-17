package br.com.alura.dados.modelos;

public class GuardaAnimais {

	private Animal[] jaula;
	private int posicaoLivre;
	
	public GuardaAnimais () {
		
		this.jaula = new Animal[10];
		this.posicaoLivre = 0;
	}
	
	public void adicionaAnimal(Animal pet) {
		
		this.jaula[this.posicaoLivre] = pet;
		this.posicaoLivre ++;
		
	}

	public int getDevolvePosicaoOcupada() {
		return this.posicaoLivre;
		
	}

	public Animal getReferencia(int i) {
		
		return this.jaula[i];
	}
	
	
}
