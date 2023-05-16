package es.login.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import es.login.model.User;

public class ViewLogin {

	public void view(List<User> usuarios) {
		int i = 1;
		for(User usuario : usuarios) {
			System.out.println("Usuario " + i + ": \n");
			System.out.println("Nombre: " + usuario.getNombre() + "\n");
			System.out.println("Apellido: " + usuario.getApellido() + "\n");
			System.out.println("Correo electrónico: " + usuario.getCorreoElectronico() + "\n");
			System.out.println("Nombre de usuario: " + usuario.getNombreUsuario() + "\n");
			i++;
		}
		
	}

}
