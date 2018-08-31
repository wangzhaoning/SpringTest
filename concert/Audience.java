package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	@Pointcut("execution(** concert.Performance.perform(..))")
	public void performance(){}
	
	@Around("performance()")
	public void watchePerformance(ProceedingJoinPoint jp) {
		try {
			System.out.println("silence");
			System.out.println("taking seat");
			jp.proceed();
			System.out.println("clip~");
			
		}catch(Throwable e){
			System.out.println("demanding a refund!");
		}
	}
}
