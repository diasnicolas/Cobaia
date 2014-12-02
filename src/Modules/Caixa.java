package Modules;

import Aspects.Extensions.LogTiming;

public class Caixa implements IModulo {
	
	@LogTiming
	@Override
	public void carrega() {
		System.out.println("Carregando o módulo Caixa.");
		for(int i=0;i<1290000;i++)
			System.out.println("");
	}
}
