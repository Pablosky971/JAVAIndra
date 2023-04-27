package gatitos;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.json.JSONObject;

public class GatitosGus {
	public static void main(String[] args) {
		
		// Programa RandomCatForGus
		
		JFrame ventana = new JFrame ("RandomCatForGus <3");
		JLabel etiqueta = new JLabel("¡Bienvenido a RandomCatForGus <3!");
		JPanel panelBoton = new JPanel();
		JButton boton = new JButton("Imprimir gatito");
		boton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try {
					URL url = new URL(getUrlGatito());
					ImageIcon imagenGatitoMono = new ImageIcon(url);
					ImageIcon imagenGatitoMonoDimensionada = new ImageIcon(imagenGatitoMono.getImage().getScaledInstance(700, 700, java.awt.Image.SCALE_SMOOTH));
					etiqueta.setIcon(imagenGatitoMonoDimensionada);
				} catch (MalformedURLException em) {
					// TODO Auto-generated catch block
					em.printStackTrace();
				} catch (IOException ei) {
					// TODO Auto-generated catch block
					ei.printStackTrace();
				}
				

			}	
		});
		
		panelBoton.add(etiqueta);
		panelBoton.add(boton);
		ventana.add(panelBoton);
		ventana.pack();
		ventana.setVisible(true);
}
	public static String getUrlGatito() {
		String urlImagenRandomGatito = null;
		try {
			URL url = new URL("https://api.thecatapi.com/v1/images/search");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect(); 
			int tiempoDeRespuesta = con.getResponseCode();
			if (tiempoDeRespuesta != 200)
			{
				throw new RuntimeException("HttpResponseCode" + tiempoDeRespuesta);			
			}
			else
			{
				StringBuilder informacion = new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext())
				{
					informacion.append(sc.nextLine());
				}
				sc.close();
				
				// Eliminamos los corchetes
				informacion.deleteCharAt(0);
				informacion.deleteCharAt(informacion.length()-1);
				
				JSONObject jsonGatito = new JSONObject(informacion.toString());
				urlImagenRandomGatito= jsonGatito.getString("url");
				System.out.println("La URL del gatito es: " + urlImagenRandomGatito);
			} 
		} catch(IOException e) {
			e.printStackTrace();
		}
		return urlImagenRandomGatito;
	}
}
