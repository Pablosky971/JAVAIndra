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

import es.homebanking.controller.HomeBankingController;

public class VentanaPrincipal extends JFrame {
	
	private static final long serialVersionUID = 1L;


	private JPanel panel;
	private JLabel bienvenida;
	private JButton logInButton;
	private JButton registroButton;
	
	public VentanaPrincipal() {
		setVisible(true);
		setTitle("Homebanking");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		bienvenida = new JLabel("Bienvenid@ a nuestra aplicación de Homebanking. Si ya eres usuario, por favor logueate; de lo contrario, registrate.");
		bienvenida.setOpaque(true);
		bienvenida.setBackground(Color.WHITE);
		logInButton = new JButton("Iniciar sesion");
		registroButton = new JButton("Registro");
		panel.add(bienvenida);
		panel.add(logInButton);
		panel.add(registroButton);
		getContentPane().add(panel);
		pack();
		setVisible(true);
	}
	public JButton getLogInButton() {
		
		return logInButton;
	}
	public JButton getRegistroButton() {
		
		return registroButton;
	}
	

	
}
