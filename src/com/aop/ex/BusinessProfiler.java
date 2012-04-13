package com.aop.ex;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BusinessProfiler {
	@Pointcut("execution(* com.aop.ex.target.*.*(..))")
	public void businessMethods(){}
	
	@Around("businessMethods()")
	public Object profile(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("around start");
		Object obj = pjp.proceed();
		System.out.println("around end");
		return obj;
	}
	
	@Before("businessMethods()")
	public void before(JoinPoint jp){
		System.out.println("before:"+jp.getSignature().getName());
	}
	
	@After("businessMethods()")
	public void after(JoinPoint jp){
		System.out.println("after:"+jp.getSignature().getName());
	}
}
