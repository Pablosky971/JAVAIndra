package es.aop.login.user;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import es.aop.login.user.entity.Usuario;

@Component
public class Registro {
	
	
	public Usuario registroDeUsuario() {
		
		Scanner scanner = new Scanner(System.in);
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
		
		Usuario usuario =  new Usuario(nombre, apellido, LocalDate.of(anio, mes, dia), nombreUsuario, email);
		System.out.println("La edad del usuario registrado es: " + usuario.edad());
		return usuario;
				
		
	}

}
