package es.homebanking.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
	private String nombre;
	private String password;
	private String apellido;
	private String ciudad;
	private String email;
	private LocalDate fechaNacimiento;
	private Boolean inicioSesion;
	private List<Producto> tarjetas = new ArrayList<>();
	
	public User(String nombre, String password, String apellido, String ciudad, String email,
			LocalDate fechaNacimiento) {
	
		this.nombre = nombre;
		this.password = password;
		this.apellido = apellido;
		this.ciudad = ciudad;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.tarjetas.add(new Producto());
	}
	
	

	

}
