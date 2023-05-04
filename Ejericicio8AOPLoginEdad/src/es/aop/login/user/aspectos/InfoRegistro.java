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
	public void infoLogin(JoinPoint joinPoint) {
		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();
		System.out.println("Tiempo de ejecución de la funcion: " + (endTime - startTime));
		System.out.println("Ejecutando metodo: " + joinPoint.getSignature().getName());
		String username = System.getProperty("user.name");
	    System.out.println("El usuario que esta ejecutando el programa es: "+ username);
	    
	}
	
	@After("execution(public * es.aop.login.user.Registro.registroDeUsuario(..))")
	public void infoLoginFinished() {
		System.out.println("El metodo finalizó");
	    
	}
	
	
	
	

}
