package br.com.tdstecnologia;

import br.com.tdstecnologia.tiposDeClasses.ClassePadrao;
import br.com.tdstecnologia.tiposDeClasses.modificadoresDeAcesso.ClasseComMembrosPrivados;
import br.com.tdstecnologia.tiposDeClasses.modificadoresDeAcesso.ClassePublicaComMenbrosDefault;

class App {

	public static void main(String[] args) {
		new ClassePadrao();
		
		// new ClasseDefault(); // nao e possivel importar, classe sem modificador de acesso
		
		ClassePublicaComMenbrosDefault classe1;
		classe1 = new ClassePublicaComMenbrosDefault();
		
		
		ClassePadrao classePadrao = new ClassePadrao();		
		ClasseComMembrosPrivados classePrivate = new ClasseComMembrosPrivados();		
		
		System.out.println(  classePadrao.descricao  );
		// System.out.println(  classePrivate.descricao  ); // atributo descricao esta como privado
	}
	
}
