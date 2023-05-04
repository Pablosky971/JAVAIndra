package es.aop.login.user;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import es.aop.login.user.aspectos.InfoRegistro;
@Configuration 
@ComponentScan("es.aop.login.user") 
@EnableAspectJAutoProxy 
public class Configuracion {
	@Bean
	public InfoRegistro infoRegistroAspect() {
		return new InfoRegistro();
		

	}
	
		
	
	
}
