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

public class VentanaLogin extends JFrame {

	private static final long serialVersionUID = 1L;

	
	private JPanel panel;
	private JLabel nombreLabel;
	private JLabel passwordLabel;
	private JLabel mensajeInicioSesion;
	private JTextField nombreTextField;
	private JPasswordField passwordTextField;
	private JButton logInButton;

	public VentanaLogin() {
		setTitle("Log in");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		mensajeInicioSesion = new JLabel("Log in");
		mensajeInicioSesion.setOpaque(true);
		mensajeInicioSesion.setBackground(Color.WHITE);
		logInButton = new JButton("Iniciar sesion");
		nombreLabel = new JLabel("Nombre de usuario: ");
		nombreTextField = new JTextField(20);
		passwordLabel = new JLabel("Contraseña: ");
		passwordTextField = new JPasswordField(20);

		panel.add(nombreLabel);
		panel.add(nombreTextField);
		panel.add(passwordLabel);
		panel.add(passwordTextField);
		panel.add(logInButton);

		getContentPane().add(panel);
		pack();
		
		
	}

	public JTextField getNombreField() {

		return nombreTextField;
	}

	public JPasswordField getPasswordField() {

		return passwordTextField;
	}
	public JButton getLogInButton() {
		
		return logInButton;
	}

}
