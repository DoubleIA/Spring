package springaop;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class RepairAspect {
	@AfterThrowing(throwing="exception", pointcut="execution(* springaop.*.*(..))")
	public void doRecoveryActions(Throwable exception) {
		Logger logger = Logger.getLogger(getClass());
		logger.info("Target method throws exception: " + exception);
		logger.info("Repair exception...");
	}
}
