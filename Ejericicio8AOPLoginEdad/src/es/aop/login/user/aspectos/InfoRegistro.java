package es.aop.login.user.aspectos;

import java.time.LocalDate;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class InfoRegistro {
	
	@Around("execution(public * es.aop.login.user.Registro.registroDeUsuario(..))")
	public Object infoLogin(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		Object user = joinPoint.proceed();
		long endTime = System.currentTimeMillis();
		System.out.println("Tiempo de ejecución de la funcion: " + (endTime - startTime));
		System.out.println("Ejecutando metodo: " + joinPoint.getSignature().getName());
		String username = System.getProperty("user.name");
	    System.out.println("El usuario que esta ejecutando el programa es: "+ username);
	    return user;
	}
	
	@After("execution(public * es.aop.login.user.Registro.registroDeUsuario(..))")
	public void infoLoginFinished() {
		System.out.println("El metodo finalizó");
	    
	}
	
	
	
	

}
