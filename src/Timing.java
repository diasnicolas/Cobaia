import framework.aop.IAspect;
import framework.aop.structures.CurrentMethod;

public class Timing implements IAspect {

	private long start;

	@Override
	public void around() {
		
		this.start = System.currentTimeMillis();

		CurrentMethod.proceed();
		
		System.out.println("Método levou: "+(System.currentTimeMillis()-this.start)+" ms.");
	}

	@Override
	public void before() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void after() {
		// TODO Auto-generated method stub
		
	}
}
