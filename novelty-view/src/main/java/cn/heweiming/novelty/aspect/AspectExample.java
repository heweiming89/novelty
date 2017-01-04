package cn.heweiming.novelty.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.springframework.dao.DataAccessException;

public class AspectExample {

	@Before("com.xyz.myapp.SystemArchitecture.dataAccessOperation()")
	public void doAccessCheck() {
		// ...
	}

	@AfterReturning("com.xyz.myapp.SystemArchitecture.dataAccessOperation()")
	public void doAccessCheck2() {
		// ...
	}

	@AfterReturning(pointcut = "com.xyz.myapp.SystemArchitecture.dataAccessOperation()", returning = "retVal")
	public void doAccessCheck(Object retVal) {
		// ...
	}

	@AfterThrowing(pointcut = "com.xyz.myapp.SystemArchitecture.dataAccessOperation()", throwing = "ex")
	public void doRecoveryActions(DataAccessException ex) {
		// ...
	}

	@After("com.xyz.myapp.SystemArchitecture.dataAccessOperation()")
	public void doReleaseLock() {
		// ...
	}

	@Around("com.xyz.myapp.SystemArchitecture.businessService()")
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
		// start stopwatch
		Object retVal = pjp.proceed();
		// stop stopwatch
		return retVal;
	}
}
