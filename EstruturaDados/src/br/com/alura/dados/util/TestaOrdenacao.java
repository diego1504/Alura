package br.com.alura.dados.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.function.Consumer;

import br.com.alura.dados.modelos.Animal;

public class TestaOrdenacao {
	
	public static void main(String[] args) {

	
	LinkedList<Animal> lista = new LinkedList<Animal>();
	
	
	
	Animal pet = new Animal("Lolla", "Cachorro", 35);
	Animal pet1 = new Animal("Bitico", "Papagaio", 52);
	Animal pet2 = new Animal("Talita", "Humana", 29);
	Animal pet3 = new Animal("Percebs", "Passarinho", 01);
	
	
	lista.add(pet);
	lista.add(pet1);
	lista.add(pet2);
	lista.add(pet3);
	
	for (Animal animal : lista) {
		System.out.println(animal.toString());
	}
	System.out.println("----------------------------");
	
	//implementado dois tipo de comparacao para usar no metodo sort, que tem como entrada uma classe comparator que deve ser reescrito com nosso criterio
	Comparadora Cmp = new Comparadora();
	ComparaNomes cmpn = new ComparaNomes();
	//lista.sort(new ComparaNomes()); // <- outra maneira de colocar objetos na lista
	
	lista.sort ( 
			
		(Animal a1, Animal a2)  ->  Integer.compare(a1.getIdade(), a2.getIdade())
	
	); //exemplo de uso de lamba, neste sort teriamos que passar um objeto da classe ComparaNomes, 
	  //para evitar uso de muito codigo veja que é possivel -> ir direto para o trecho de codigo que queremos
	
	for (Animal animal : lista) {
		System.out.println(animal.toString());
	}
	
	
	//exemplo abaixo usando classe anonimas, veja que eu preciso criar uma classe como a Comparanomes ali em baixo
	//lambda ainda é melhor, pois assim fica bem confuso a leitura do codigo
//	lista.forEach(new Consumer<Animal>()  {
//		
//		@Override
//		public void accept(Animal a) {
//			System.out.println(a.toString());
//		                             }
//	                                       }
//			
//                 );

	//abaixo uso com lambda
	lista.forEach( 
			(Animal a) -> System.out.println(a.toString())
		         );	
	
	
	
	
	
	
	
	}

	
	
	
	
class ComparaNomes implements Comparator<Animal>{

	@Override
	public int compare(Animal o1, Animal o2) {
		
		String a1 = o1.getNome();
		String a2 = o2.getNome();
		return a1.compareTo(a2);
	}
	
}


class Comparadora implements Comparator<Animal> {

	@Override
	public int compare(Animal a1, Animal a2) {
		
		return Integer.compare(a1.getIdade(), a2.getIdade());
		
	//	return a1.getIdade() - a2.getIdade();
		
//		if (a1.getIdade() < a2.getIdade()) {
//			return -1;
//		} else {
//			return 1;
//		}
		


	}
	
}