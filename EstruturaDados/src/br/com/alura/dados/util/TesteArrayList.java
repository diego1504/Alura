package br.com.alura.dados.util;

import java.util.ArrayList;

import br.com.alura.dados.modelos.Animal;

public class TesteArrayList {
	
	public static void main(String[] args) {

		
		//importante colocar <Animal> para forcar o compilador meajudar a achar erros de cast ou tipagem. nice!!
		// o nome destes conchetes é generics  
	ArrayList<Animal> lista = new ArrayList<Animal>();
	
	Animal pet = new Animal("Lolla", "Cachorro", 3);
	Animal pet1 = new Animal("Pitico", "Papagaio", 5);
	
	lista.add(pet);
	lista.add(pet1);
	
	System.out.println(lista.size());
	
	Animal animal = (Animal) lista.get(0);
	System.out.println(animal.faseVida(animal.getIdade()));
	
	for (int i = 0; i < lista.size(); i++) {
		System.out.println(lista.get(i));
		
	}
	
	
	
	}
	
}
	

