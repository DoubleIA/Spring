package springaop;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TxAspect {
	@Around("execution(* springaop.*.*(..))")
	public Object processTx(ProceedingJoinPoint jp) throws java.lang.Throwable {
		Logger logger = Logger.getLogger(getClass());
		logger.info("Before executing method, start transaction...");
		Object[] args = jp.getArgs();
		if (args != null && args.length > 1) {
			args[0] = "[Pre]" + args[0];
		}
		Object rt = jp.proceed(args);
		logger.info("After executing method, stop transaction...");
		if (rt != null && rt instanceof Integer) {
			rt = (Integer) rt * (Integer) rt;
		}
		return rt;
	}
	
}
