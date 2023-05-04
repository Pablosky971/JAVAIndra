package es.aop.login.user.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Usuario extends Persona {
	
	private String nombreUsuario;
	private String email;
	public Usuario(String nombre, String apellido, LocalDate fechaNacimiento, String nombreUsuario, String email) {
		super(nombre, apellido, fechaNacimiento);
		this.nombreUsuario = nombreUsuario;
		this.email = email;
	}
	
	

}
