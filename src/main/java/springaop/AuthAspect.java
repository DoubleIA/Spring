package springaop;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AuthAspect {
	
	@Before("execution(* springaop.*.*(..)) && args(arg0, arg1)")
	public void authority(String arg0, String arg1) {
		Logger logger = Logger.getLogger(getClass());
		logger.info("Executing authority..." + "name: " + arg0 + " password: " + arg1);
	}
	
}
