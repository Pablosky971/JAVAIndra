package es.aop.login.user;

import java.time.LocalDate;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import es.aop.login.user.entity.Usuario;

@Component
public class Registro {

	public Usuario registroDeUsuario(String nombre, String apellido, LocalDate fechaNacimiento, String nombreUsuario, String email) {
		
		Usuario usuario = new Usuario(nombre, apellido, fechaNacimiento, nombreUsuario, email);
		System.out.println("La edad del usuario " + nombreUsuario + " registrado es: " + usuario.edad());
		return usuario;
	}

}
