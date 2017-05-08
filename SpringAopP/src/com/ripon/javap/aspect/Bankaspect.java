package com.ripon.javap.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Bankaspect {
	
	@Around("@annotation(com.ripon.javap.aspect.banka)")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		Object returnValue=null;
		
		try {
			
			System.out.println("Welcome to our Bank ");
			System.out.println("About Bank: ");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("Thank you for visiting our website ");
			
		} catch (Throwable e) {
			
			System.out.println("throwing proceed ");
		}
		//System.out.println("finally proceed");
		return returnValue;
	}
	
	public void logginAdvice(){
		System.out.println("this is advice");
	}

}
