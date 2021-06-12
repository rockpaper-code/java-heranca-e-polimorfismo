package br.com.tdstecnologia.heranca.animais;

public class Gato extends Animal {

	
	
	public String getNome() {

		if(this.nome != null ) {
			return this.nome ;
		} else {
			return "nome indefinido";
		}
		
	}
	
	public void setNome( String nomeDoGato  ) {
		
		if ( nomeDoGato != null ) {			
			this.nome = nomeDoGato;			
		} 	
	}
	
	public void setIdade( int idade ) {
		// if ternario
		// [ condicao ] ? [ caso verdadeiro] : [esle]
		
		this.idade = idade < 0 ? 0 : idade;
	}

	
	@Override
	public String getAlimento() {
		// TODO Auto-generated method stub
		return null;
	}

}
