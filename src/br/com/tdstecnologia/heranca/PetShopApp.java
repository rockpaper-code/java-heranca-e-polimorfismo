package br.com.tdstecnologia.heranca;

import br.com.tdstecnologia.heranca.animais.Animal;
import br.com.tdstecnologia.heranca.animais.Cachorro;
import br.com.tdstecnologia.heranca.animais.Coelho;
import br.com.tdstecnologia.heranca.animais.Gato;

public class PetShopApp {
	
	public static void main(String[] args) {
		
		Cachorro cachorro = new  Cachorro();
		cachorro.nome = "pepe";
		cachorro.idade = 3;
		
		Gato gato = new Gato();
		
		gato.setNome( null );		
		// gato.setNome("Lilica");	
		
		gato.setSexo("FEMEA");
		gato.setIdade(-5);
		
		System.out.println("-------------------------");
		System.out.println( gato.getNome()  );
		System.out.println( gato.getSexo()  );
		System.out.println( gato.getIdade()  );
		
		

		Coelho coelho = new Coelho();
		coelho.setNome( "fluffy" );
		coelho.setIdade( 1  );
		
		System.out.println("-------------------------");
		System.out.println( coelho.getNome()  );
		System.out.println( coelho.getIdade()  );
		System.out.println( coelho.getAlimento()  );
	
	}

}
