package es.aop.login.user.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.aop.login.user.Registro;
import es.aop.login.user.aspectos.InfoRegistro;
import es.aop.login.user.entity.Usuario;

public class RegistroUsuarios {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(InfoRegistro.class);
		Registro registro = context.getBean(Registro.class);
		Usuario usuario = registro.registroDeUsuario();
		
		context.close();
	}

}
