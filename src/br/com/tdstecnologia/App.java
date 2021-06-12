package br.com.tdstecnologia;

import br.com.tdstecnologia.tiposDeClasses.*;
import br.com.tdstecnologia.tiposDeClasses.modificadoresDeAcesso.ClassePublicaComMenbrosDefault;

public class App {

	public static void main(String[] args) {
		new ClassePadrao();
		
		// new ClasseDefault(); // nao e possivel importar, classe sem modificador de acesso
		
		ClassePublicaComMenbrosDefault classe1;
		classe1 = new ClassePublicaComMenbrosDefault();
	}
}
