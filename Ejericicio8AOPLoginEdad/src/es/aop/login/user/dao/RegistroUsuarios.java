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
		System.out.println("Indique el número de usuarios: ");
		int numeroUsuarios = scanner.nextInt();
		List<Usuario> usuarios = new ArrayList<>();
		for(int i=1;i<=numeroUsuarios;i++) {
			
			System.out.println("Nombre: " + "\n");
			String nombre = scanner.next();
			System.out.println("Apellido: " + "\n");
			String apellido = scanner.next();
			System.out.println("Nombre de usuario: " + "\n");
			String nombreUsuario = scanner.next();
			System.out.println("Email: " + "\n");
			String email = scanner.next();
			System.out.println("Fecha de nacimiento (formato yyyy/mm/dd): " + "\n");
			String fechaNacimiento = scanner.next();
			String[] fechaNacimientoParticionada = fechaNacimiento.split("/");
			int anio = Integer.parseInt(fechaNacimientoParticionada[0]);
			int mes = Integer.parseInt(fechaNacimientoParticionada[1]);
			int dia = Integer.parseInt(fechaNacimientoParticionada[2]);	
			
			
			usuarios.add(registro.registroDeUsuario(nombre, apellido, LocalDate.of(anio, mes, dia), nombreUsuario, email));
		}
		scanner.close();
		int i = 1;
		for(Usuario usuario : usuarios) {
			System.out.println("==========================================" + "\n");
			System.out.println("Usuario " + i + ": "  + usuario.getNombreUsuario() + "\n");
			System.out.println("==========================================" + "\n");
			System.out.println("Nombre: " + usuario.getNombre() + "\n");
			System.out.println("Apellido: " + usuario.getApellido() + "\n");
			System.out.println("Fecha de nacimiento: " + usuario.getFechaNacimiento() + "\n");
			System.out.println("Nombre de usuario: " + usuario.getNombreUsuario() + "\n");
			System.out.println("Email: " + usuario.getEmail() + "\n");
			System.out.println("La edad del usuario " + usuario.getNombreUsuario() + " registrado es: " + usuario.edad());
			i++;
			 
		}
		context.close();
		
		
		
	}

}
