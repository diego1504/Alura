package br.com.alura.dados.testes;

import br.com.alura.dados.modelos.Animal;

public class TestaDados {

	

		int idades[] = new int[5];

		idades[0] = 01;
		idades[1] = 10;
		idades[2] = 12;
		idades[3] = 44;
		idades[4] = 58;
		
		System.out.println(idades[2]);
		
		for (int i = 0; i < idades.length; i ++) {
			System.out.println(idades[i]);
		}
		
		Animal pet = new Animal("Lolla", "Bulldog", 3);
		Animal zattar = new Animal("Zattar", "Greyhound", 2);
		System.out.println("idade: "+ pet.faseVida(pet.getIdade()));
		
		Object[] Matilha = new Animal[5];
		//Animal[] Matilha = new Animal[5]; podemos criar um array com a classe base object
		
		Matilha[0] =  pet;
		Matilha[1] =  zattar;
		
		try {
				for (int i = 0; i < Matilha.length; i ++) {
					System.out.println(((Animal) Matilha[i]).getNome());
				}
		} catch (NullPointerException ex) {
				System.out.println("Null");
		}
		
		
		
		
		
	}
}
