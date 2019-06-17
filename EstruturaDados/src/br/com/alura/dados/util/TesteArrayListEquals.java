package br.com.alura.dados.util;

import java.util.ArrayList;
import java.util.LinkedList;

import br.com.alura.dados.modelos.Animal;

public class TesteArrayListEquals {
	
	public static void main(String[] args) {

		
		//importante colocar <Animal> para forcar o compilador meajudar a achar erros de cast ou tipagem. nice!!
		// o nome destes conchetes � generics  
		
		// linked list � um vector duplamenta encadeado, onde uma referencia sabe quem � a proxima e a anterior
		// mais performatico para operacoes de entra e sai da lista, porem para leitura � mais lento pois o indice nao � acessado diretamente
	LinkedList<Animal> lista = new LinkedList<Animal>();
	
	lista.get(1);
	
	Animal pet = new Animal("Lolla", "Cachorro", 3);
	Animal pet1 = new Animal("Pitico", "Papagaio", 5);
	
	lista.add(pet);
	//lista.add(pet1);
	
	boolean existe = lista.contains(pet1);
	System.out.println("Existe?: " + existe);
	
	//System.out.println(lista.equals(pet1));
	
	
	}
	
}
	

