package System;

import java.util.ArrayList;

import Aspects.Extensions.EnableLogInFile;
import Aspects.Extensions.LogTiming;
import Modules.IModulo;

public class Sistema {
	
	
	private ArrayList<IModulo> modulos = new ArrayList<IModulo>();

	public Sistema()
	{
		this.init();
	}
	
	@EnableLogInFile
	private void init()
	{	
		//configurações do sistema
	}
	
	public ArrayList<IModulo> getModulos() {
		return modulos;
	}
	
	@LogTiming
	public void carregaModulos()
	{
		for(IModulo modulo:modulos)
		{
			modulo.carrega();
		}
	}
}
