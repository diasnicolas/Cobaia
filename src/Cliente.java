import framework.aop.annotations.Around;

public class Cliente {

	@Around({Timing.class})
	public void salvar()
	{
		/*
		 * Lógica para salvar o cliente
		 */
	}
}
