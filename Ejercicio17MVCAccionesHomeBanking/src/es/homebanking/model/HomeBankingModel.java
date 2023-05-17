package es.homebanking.model;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HomeBankingModel {
	private List<User> usuariosRegistrados = new ArrayList<>();
	private User usuarioActivo;
	
	public HomeBankingModel() {
		generarProductosUsuario();
	}
	
	private void generarProductosUsuario() {
		User user1 = new User("Pablosky", "1234", "Calle", "Sevilla", "pablosky@gmail.com", LocalDate.of(1998, 04, 03));
		User user2 = new User("Gustavo", "1234", "Vargas", "Barcelona", "gus@gmail.com", LocalDate.of(1992, 07, 05));
		user1.getTarjetas().add(new Producto());
		user2.getTarjetas().add(new Producto());
		usuariosRegistrados.add(user1);
		usuariosRegistrados.add(user2);
	}
	
	
}
