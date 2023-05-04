package es.aop.login.user.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.aop.login.user.Configuracion;
import es.aop.login.user.Registro;
import es.aop.login.user.entity.Usuario;

public class RegistroUsuarios {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);
		Registro registro = context.getBean(Registro.class);
		Scanner scanner = new Scanner(System.in);
		List<Usuario> usuarios = new ArrayList<>();
		for(int i =0;i<1;i++) {
			
			System.out.println("Nombre: " + "\n");
			String nombre = scanner.next();
			System.out.println("Apellido: " + "\n");
			String apellido = scanner.next();
			System.out.println("Nombre de usuario: " + "\n");
			String nombreUsuario = scanner.next();
			System.out.println("Email: " + "\n");
			String email = scanner.next();
			System.out.println("Fecha de nacimiento (yyyy/mm/dd): " + "\n");
			String fechaNacimiento = scanner.next();
			String[] fechaNacimientoParticionada = fechaNacimiento.split("/");
			int anio = Integer.parseInt(fechaNacimientoParticionada[0]);
			int mes = Integer.parseInt(fechaNacimientoParticionada[1]);
			int dia = Integer.parseInt(fechaNacimientoParticionada[2]);	
			
			Usuario usuario = registro.registroDeUsuario(nombre, apellido, LocalDate.of(anio, mes, dia), nombreUsuario, email);
			usuarios.add(usuario);
		}
		scanner.close();
		System.out.println("Usuarios: " + usuarios.get(0));
		context.close();
		
		
	}

}
