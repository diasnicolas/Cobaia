package System;

import Modules.Caixa;
import Modules.Estoque;
import Modules.Financeiro;

public class Main {

	public static void main(String[] args) {
		
		Sistema sistema = new Sistema();
		
		sistema.getModulos().add(new Estoque());
		sistema.getModulos().add(new Financeiro());
		sistema.getModulos().add(new Caixa());
		
		sistema.carregaModulos();
	}
}
