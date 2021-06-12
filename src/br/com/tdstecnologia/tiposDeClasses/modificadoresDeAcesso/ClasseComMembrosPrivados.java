package br.com.tdstecnologia.tiposDeClasses.modificadoresDeAcesso;

public class ClasseComMembrosPrivados {
	
	private String descricao = "ClasseComMembrosPrivados";
	
	public ClasseComMembrosPrivados() {
		marcador();
		sobre();
	}
	
	void sobre() {
		System.out.println(  "Esta executando a classe: " + descricao  );
	}
	
	private void marcador() {
		System.out.println( "----------------------" );
	}
}
