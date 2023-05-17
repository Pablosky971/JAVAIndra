package es.homebanking.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

import es.homebanking.model.HomeBankingModel;
import es.homebanking.model.Producto;
import es.homebanking.model.User;
import es.homebanking.view.VentanaLogin;
import es.homebanking.view.VentanaPrincipal;
import es.homebanking.view.VentanaProductos;
import es.homebanking.view.VentanaRegistracion;

public class HomeBankingController {

	private User usuarioActivo;
	private HomeBankingModel model;
	private VentanaPrincipal viewPrincipal;

	public HomeBankingController(HomeBankingModel model, VentanaPrincipal viewPrincipal) {
		super();
		this.model = model;
		this.viewPrincipal = viewPrincipal;
		this.viewPrincipal.getLogInButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				logIn();

			}
		});
		this.viewPrincipal.getRegistroButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				registro();
			}
		});
	}

	public void logIn() {

		VentanaLogin viewLogin = new VentanaLogin();
		viewLogin.setVisible(true);

		viewLogin.getLogInButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nombreUsuario = viewLogin.getNombreField().getText();
				String password = viewLogin.getPasswordField().getText();

				for (User user : model.getUsuariosRegistrados()) {
					Boolean res = user.getNombre().equals(nombreUsuario) && user.getPassword().equals(password) ? true
							: false;
					if (res) {

						user.setInicioSesion(true);
						model.setUsuarioActivo(user);
						System.out.println("¡Bienvenido " + user.getNombre() + "!");
						VentanaProductos viewProductos = new VentanaProductos(model.getUsuarioActivo().getTarjetas());
						viewProductos.setVisible(true);
						

					} else {
						System.out.println(
								"Los datos introducidos no coinciden con los de ningún usuario registrado en el sistema.");
					}

				}
			}
		});

	}

	public void registro() {
		VentanaRegistracion viewRegistracion = new VentanaRegistracion();
		viewRegistracion.setVisible(true);

		viewRegistracion.getRegistroButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String nombreUsuario = viewRegistracion.getNombreField().getText();
				String apellido = viewRegistracion.getApellidoField().getText();
				String password = viewRegistracion.getPasswordField().getText();
				String ciudad = viewRegistracion.getCiudadField().getText();
				String email = viewRegistracion.getEmailField().getText();
				String fechaNacimiento = viewRegistracion.getFechaNacimientoField().getText();
				String[] fechaNacimientoParticionada = fechaNacimiento.split("-");
				int anio = Integer.parseInt(fechaNacimientoParticionada[2]);
				int mes = Integer.parseInt(fechaNacimientoParticionada[1]);
				int dias = Integer.parseInt(fechaNacimientoParticionada[0]);
				User user = new User(nombreUsuario, password, apellido, ciudad, email, LocalDate.of(anio, mes, dias));
				Boolean isRegistrado = model.getUsuariosRegistrados().add(user);
				if (!isRegistrado) {
					System.out.println("Los datos introducidos no son válidos. Vuelva a intentarlo.");
				} else {
					user.setInicioSesion(true);
					model.setUsuarioActivo(user);
					System.out.println("¡Bienvenido " + user.getNombre() + "!");
					VentanaProductos viewProductos = new VentanaProductos(model.getUsuarioActivo().getTarjetas());
					viewProductos.setVisible(true);
				}
			}
		});

	}

}
