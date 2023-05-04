package es.aop.login.user;

import java.time.LocalDate;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import es.aop.login.user.entity.Usuario;

@Component
public class Registro {

	public Usuario registroDeUsuario(String nombre, String apellido, LocalDate fechaNacimiento, String nombreUsuario, String email) {
		try 
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		Usuario usuario = new Usuario(nombre, apellido, fechaNacimiento, nombreUsuario, email);
		System.out.println("La edad del usuario " + nombreUsuario + " registrado es: " + usuario.edad());
		return usuario;
	}

}
