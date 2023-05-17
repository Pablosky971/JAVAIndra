package es.homebanking.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VentanaRegistracion extends JFrame{
	private static final long serialVersionUID = 1L;


	private JPanel panel;
	private JLabel nombreLabel;
	private JLabel ciudadLabel;
	private JLabel emailLabel;
	private JLabel passwordLabel;
	private JLabel salarioLabel;
	private JLabel apellidoLabel;
	private JLabel fechaNacimientoLabel;
	private JLabel mensajeRegistro;
	private JTextField nombreTextField;
	private JTextField apellidoTextField;
	private JPasswordField passwordTextField;
	private JTextField ciudadTextField;
	private JTextField emailTextField;
	private JTextField fechaNacimientoTextField;
	private JButton registroButton;

	public VentanaRegistracion() {
	
		
		setTitle("Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		mensajeRegistro = new JLabel("Formulario registro");
		mensajeRegistro.setOpaque(true);
		mensajeRegistro.setBackground(Color.WHITE);
		registroButton = new JButton("Registrarse");
		nombreLabel = new JLabel("Nombre de usuario: ");
		nombreTextField = new JTextField(20);
		apellidoLabel = new JLabel("Apellido: ");
		apellidoTextField = new JTextField(20);
		passwordLabel = new JLabel("Contraseña: ");
		passwordTextField = new JPasswordField(20);
		ciudadLabel = new JLabel("Ciudad: ");
		ciudadTextField = new JTextField(20);
		emailLabel = new JLabel("Dirección de email: ");
		emailTextField = new JTextField(20);
		fechaNacimientoLabel = new JLabel("Fecha de nacimiento (formato dd-MM-YYYY): ");
		fechaNacimientoTextField = new JTextField(20);

		panel.add(nombreLabel);
		panel.add(nombreTextField);
		panel.add(apellidoLabel);
		panel.add(apellidoTextField);
		panel.add(passwordLabel);
		panel.add(passwordTextField);
		panel.add(ciudadLabel);
		panel.add(ciudadTextField);
		panel.add(emailLabel);
		panel.add(emailTextField);
		panel.add(fechaNacimientoLabel);
		panel.add(fechaNacimientoTextField);
		panel.add(registroButton);
		getContentPane().add(panel);
		pack();
		
	}

	public JTextField getNombreField() {

		return nombreTextField;
	}
	public JTextField getApellidoField() {

		return apellidoTextField;
	}
	public JPasswordField getPasswordField() {

		return passwordTextField;
	}
	public JTextField getCiudadField() {

		return ciudadTextField;
	}
	public JTextField getEmailField() {

		return emailTextField;
	}
	
	public JTextField getFechaNacimientoField() {

		return fechaNacimientoTextField;
	}

	public JButton getRegistroButton() {
		
		return registroButton;
	}

}
