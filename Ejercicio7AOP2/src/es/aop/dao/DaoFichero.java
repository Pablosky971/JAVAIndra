package es.aop.dao;

import java.util.Set;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.aop.Configuracion;
import es.aop.FicheroDAO;


public class DaoFichero {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		FicheroDAO daoFichero = contexto.getBean("ficheroDAO", FicheroDAO.class);
		daoFichero.leerFichero();
		contexto.close();
		
		
	}

}
