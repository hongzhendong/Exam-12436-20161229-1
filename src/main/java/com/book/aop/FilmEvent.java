package com.book.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class FilmEvent {

		@Pointcut("execution(* com.book.serviceimp.*(..))")
		private void selectAll(){
			
		}
		@Before("selectAll()")
		public void beforeAdvice(){
			System.out.println("before insert Film Date");
		}
		@After("selectAll()")
		public void afterAdvice(){
			System.out.println("after insert film Data");
		}
		@AfterReturning(pointcut="selectAll()",returning="retVal")
		public void afterReturnAdvice(Object retVal){
			System.out.println("Returning"+retVal.toString());
		}
		@AfterThrowing(pointcut="selectAll()",throwing="ex")
		public void AfterThrowingAfter(IllegalArgumentException ex){
			System.out.println("There has been an exception:"+ex.toString());
			
		}
	

}
