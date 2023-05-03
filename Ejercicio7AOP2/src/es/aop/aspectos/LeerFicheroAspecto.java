package es.aop.aspectos;



import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LeerFicheroAspecto {

	@Before("execution(public void leerFichero())")
	public void avisoLeerFichero() {
		System.out.println("Comienza el proceso de lectura de fichero...");
	}

	@After("execution(public void leerFichero())")
	public void muestraLineasFichero() {
		System.out.println("Ya hemos finalizado el proceso de lectura del fichero.");
	}
}
