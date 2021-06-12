package br.com.tdstecnologia.tiposDeClasses.modificadoresDeAcesso;

public class ClassePublicaComMenbrosDefault {
	
	String descricao = "ClassePublicaComMenbrosDefault";

	public ClassePublicaComMenbrosDefault() {
		sobre();
		executaClasseDefault();
	}
	
	void sobre() {
		System.out.println( "Esta executando a classe: " + descricao );
	}
	
	void executaClasseDefault() {
		new ClasseDefault();
	}
}
