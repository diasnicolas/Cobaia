package Aspects;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import framework.aop.IAspect;
import framework.aop.structures.MethodExecution;

public class LoggerTiming implements IAspect {

	private long start;
	
	@Override
	public Object around(Object source, MethodExecution method){
		
	    Logger log = Logger.getLogger("logTiming");
	    this.start = System.currentTimeMillis();
	    
	    Object result = method.proceed(source);
	    
	    long tempoTotal = (System.currentTimeMillis()-this.start);
	    
	    if(tempoTotal < 5000)
	    	log.info("O método "+method.getName()+" executou em: " +((double)tempoTotal)/1000+"s.");
	    else
	    	log.warning("O método "+method.getName()+" está muito lento. "+
	    			 "Executou em " +((double)tempoTotal)/1000+"s.");
		return result;
	}

	@Override
	public void before(Object source, MethodExecution method) 
			throws Exception
	{	
		FileHandler fileHandler = new FileHandler("logTiming.log");
		fileHandler.setFormatter(new SimpleFormatter());
		fileHandler.setLevel(Level.ALL);
		Logger.getLogger("").addHandler(fileHandler);
	}

	@Override
	public void after(Object source, MethodExecution method) {
	}
}
