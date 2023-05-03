package es.aop;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@Configuration 
@ComponentScan("es.aop") 
@EnableAspectJAutoProxy 
public class Configuracion {

}
