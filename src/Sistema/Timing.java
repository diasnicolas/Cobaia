package Sistema;

import framework.aop.structures.MethodExecution;

public class Timing implements framework.aop.IAspect {

	private long start;

	@Override
	public Object around(Object source, MethodExecution method){
		
		this.start = System.currentTimeMillis();
		
		Object result = method.proceed(source);
		
		System.out.println("Método levou: "+(System.currentTimeMillis()-this.start)+" ms.");
		
		if(result.getClass().getSimpleName()=="String")
		{
			//String a =  ((String)result)+" string interceptada";
			//result = (Object)a;
		}
		
		
		return result;
	}

	@Override
	public void before(Object source, MethodExecution method) {
	}

	@Override
	public void after(Object source, MethodExecution method) {
		System.out.println("after");
	}
}
