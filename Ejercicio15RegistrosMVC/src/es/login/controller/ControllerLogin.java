package es.login.controller;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import es.login.model.User;
import es.login.view.ViewLogin;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ControllerLogin {
	
	private ViewLogin viewLogin;
	
	public void loginUsuarios() {
		List<User> usuarios = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("¿Cuántos usuarios desea registrar?: ");
		Integer numeroUsuarios = scanner.nextInt();
		for (int i = 1; i <=numeroUsuarios; i++) {
			System.out.println("Usuario " + i + ":");
			System.out.println("Ingrese su nombre: ");
			String nombre = scanner.next();
			System.out.println("Ingrese su apellido: ");
			String apellido = scanner.next();
			System.out.println("Ingrese su dirección de correo electrónico: ");
			String correo = scanner.next();
			System.out.println("Ingrese su nombre de usuario: ");
			String nombreUsuario = scanner.next();
			usuarios.add(new User(nombre, apellido, correo, nombreUsuario));
			
		}

		scanner.close();
		viewLogin.view(usuarios);

	}
	

}
