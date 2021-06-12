package br.com.tdstecnologia.tiposDeClasses.modificadoresDeAcesso;

class ClasseDefault {
	
	String descricao = "Esta eh uma classe com modifadores" +
					   " de acesso default";

	// contrutor da classe
	ClasseDefault()
	{
		System.out.println("Executou a classe ClasseDefault");
	}
	
	void sobre() {
		System.out.println(descricao);
	}

}
