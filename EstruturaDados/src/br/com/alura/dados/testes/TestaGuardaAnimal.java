package br.com.alura.dados.testes;
import br.com.alura.dados.modelos.*;

public class TestaGuardaAnimal {

	public static void main(String[] args) {
	
	GuardaAnimais box = new GuardaAnimais();
		
	Animal pet = new Animal("Lolla", "Cachorro", 3);
	Animal pet1 = new Animal("Pitico", "Papagaio", 5);
	
	
	box.adicionaAnimal(pet);
	box.adicionaAnimal(pet1);
	
	System.out.println(box.getDevolvePosicaoOcupada());
	
	Animal ref = box.getReferencia(0);
	
	System.out.println(ref.getNome());
	
	}
}
