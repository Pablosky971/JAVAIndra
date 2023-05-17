package es.homebanking.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import es.homebanking.model.Producto;
import es.homebanking.model.User;

public class VentanaProductos extends JFrame {
	private static final long serialVersionUID = 1L;


	private JFrame ventana;
	private JPanel panel;
	private JLabel mensajeProductos;
	private JLabel numeroTarjetaLabel;
	private JLabel saldoLabel;
	private JLabel fechaNacimientoLabel;
	
	

	public VentanaProductos(List<Producto> productos) {
	
		ventana = new JFrame();
		setTitle("Productos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		mensajeProductos = new JLabel("Productos");
		mensajeProductos.setOpaque(true);
		mensajeProductos.setBackground(Color.WHITE);
		//logOutButton = new JButton("Registrarse");
		for(Producto producto : productos) {
		numeroTarjetaLabel = new JLabel(producto.getNumeroTarjeta());
		saldoLabel = new JLabel(producto.getSaldo().toString());
		fechaNacimientoLabel = new JLabel(producto.getFechaVencimiento().toString());


		panel.add(mensajeProductos);
		panel.add(numeroTarjetaLabel);
		panel.add(saldoLabel);
		panel.add(fechaNacimientoLabel);
		}
	
		ventana.getContentPane().add(panel);
		ventana.pack();
		ventana.setVisible(true);
	}

	


}
