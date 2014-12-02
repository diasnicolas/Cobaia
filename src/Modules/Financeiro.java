package Modules;

import Aspects.Extensions.LogTiming;

public class Financeiro implements IModulo {
	
	@LogTiming
	@Override
	public void carrega() {
		System.out.println("Carregando o módulo Financeiro.");
		for(int i=0;i<2390000;i++)
			System.out.println("");
	}
}
