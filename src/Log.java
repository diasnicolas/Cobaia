import Teste.Pessoa;
import framework.aop.IAspect;
import framework.aop.annotations.Initialize;
import framework.aop.structures.CurrentMethod;


public class Log implements IAspect {
	
	@Initialize("new Teste.Pessoa()")
	private Pessoa p;
	
	@Override
	public void before() {
		this.p= new Pessoa();
		this.p.nome="Nicolas Dias";
	}

	@Override
	public void after() {
		
		System.out.println("Numero valor: "+this.p.nome);
	}

	@Override
	public void around() {

		System.out.println("Log antes");
		
		CurrentMethod.proceed();
		
		System.out.println("Log depois");
	}

}
