package ejercicio4;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProgramaJFrame {
	public static void main(String[] args) {
		JFrame ventana = new JFrame ("UtreInfo");
		ventana.setSize(1200,800);
		JLabel etiquetaImagen = new JLabel("UtreInfo", JLabel.CENTER);
		ventana.add(etiquetaImagen);
		etiquetaImagen.setForeground(Color.BLUE); 
		ventana.setVisible(true);
		String mensajeBienvenida = "¡Bienvenido a UtreInfo!";
		JLabel etiquetaBienvenida = new JLabel(mensajeBienvenida);
		etiquetaBienvenida.setForeground(Color.BLUE);
		int nHabitantes = 52617;
		String mensajeHabitantes = "Los últimos datos recogidos, apuntan " + nHabitantes + " habitantes."; 
		JLabel etiquetaHabitantes = new JLabel(mensajeHabitantes);
		etiquetaHabitantes.setForeground(Color.BLUE);
		String mensajeClima = "El clima de Utrera es templado y cálido.";
		JLabel etiquetaClima = new JLabel(mensajeClima);
		etiquetaClima.setForeground(Color.BLUE);
		String mensajeActividad ="Utrera es eminentemente agricola. Actualmente la caracteristica"
				+ " mas acusada de la actividad primaria en el termino de Utrera es la diversidad de cultivos,"
				+ " predominando los cereales."; 
		JLabel etiquetaActividad = new JLabel(mensajeActividad);
		etiquetaActividad.setForeground(Color.BLUE);
		JPanel panelBotones = new JPanel();
		JPanel panelRespuestaBotones = new JPanel();
		JButton botonBienvenida = new JButton("Bienvenida");
		JButton botonHabitantes = new JButton("Cantidad de habitantes");
		JButton botonClima = new JButton("Clima habitual");
		JButton botonActividad = new JButton("Actividad económica");
		try {
			URL url = new URL("https://espanaviajar.com/wp-content/uploads/2021/12/UTRERA-Pueblos-mas-bonitos-de-Sevilla.jpg");
			Image imagenUtrera = ImageIO.read(url);
			ImageIcon iconoImagenUtrera = new ImageIcon(imagenUtrera.getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH));
			etiquetaImagen.setIcon(iconoImagenUtrera);
		
			
		
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		botonBienvenida.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				panelRespuestaBotones.add(etiquetaBienvenida);
				panelBotones.add(etiquetaBienvenida);
				System.out.println(mensajeBienvenida);
				
			

			}	
		});
		
		botonHabitantes.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				panelRespuestaBotones.add(etiquetaHabitantes);
				ventana.add(panelRespuestaBotones);
				System.out.println(mensajeHabitantes);
				
				

			}
		});
		
		botonClima.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				panelRespuestaBotones.add(etiquetaClima);
				ventana.add(panelRespuestaBotones);
				System.out.println(mensajeClima);
				 
				

			}
		});
		
		botonActividad.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				panelRespuestaBotones.add(etiquetaActividad);
				ventana.add(panelRespuestaBotones);
				System.out.println(mensajeActividad);
				
				
			}
		});
		panelBotones.add(botonBienvenida);
		panelBotones.add(botonHabitantes);
		panelBotones.add(botonClima);
		panelBotones.add(botonActividad);
	
		ventana.add(panelBotones);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
}
