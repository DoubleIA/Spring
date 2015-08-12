package springaop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class FourAdviceTest {
	Logger logger = Logger.getLogger(getClass());
	
	@Around("execution(* springaop.*.*(..))")
	public Object processTx(ProceedingJoinPoint jp) throws java.lang.Throwable {
		logger.info("Around advice: Before executing method, start transaction...");
		Object[] args = jp.getArgs();
		if (args != null && args.length > 1) {
			args[0] = "[Pre]" + args[0];
		}
		Object rt = jp.proceed(args);
		logger.info("Around advice: After executing method, stop transaction...");
		if (rt != null && rt instanceof Integer) {
			rt = (Integer) rt * (Integer) rt;
		}
		return rt;
	}
	
	@Before("execution(* springaop.*.*(..))")
	public void authority(JoinPoint jp) {
		logger.info("Before advice: Checking authority...");
		logger.info("Before advice: Executing target method: " + jp.getSignature().getName());
		logger.info("Before advice: Target method parameters: " + Arrays.toString(jp.getArgs()));
		logger.info("Before advice: Target object: " + jp.getTarget());
	}
	
	@AfterReturning(returning="rt", pointcut="execution(* springaop.*.*(..))")
	public void log(JoinPoint jp, Object rt) {
		logger.info("AfterReturning advice: Obtain return value: " + rt);
		logger.info("AfterReturning advice: Log function..." + rt);
		logger.info("AfterReturning advice: Executing target method: " + jp.getSignature().getName());
		logger.info("AfterReturning advice: Target method parameters: " + Arrays.toString(jp.getArgs()));
		logger.info("AfterReturning advice: Target object: " + jp.getTarget());
	}
	
	@After("execution(* springaop.*.*(..))")
	public void release(JoinPoint jp) {
		logger.info("After advice: Release resouces...");
		logger.info("After advice: Executing target method: " + jp.getSignature().getName());
		logger.info("After advice: Target method parameters: " + Arrays.toString(jp.getArgs()));
		logger.info("After advice: Target object: " + jp.getTarget());
	}
}
