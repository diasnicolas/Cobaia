package Modules;

import Aspects.Extensions.LogTiming;

public class Estoque implements IModulo {
	
	@LogTiming
	@Override
	public void carrega() {
		System.out.println("Carregando o módulo Estoque.");
		for(int i=0;i<4490000;i++)
			System.out.println("");
	}
}
