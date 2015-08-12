package springaop;



import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * 注意returning属性对应的属性值 
 *
 */
@Aspect
public class LogAspect {
	@AfterReturning(returning="rt", pointcut="execution(* springaop.*.*(..))")
	public void log(Object rt) {
		Logger logger = Logger.getLogger(getClass());
		logger.info("Obtain return value: " + rt);
		logger.info("Log function..." + rt);
	}
}
