package es.vuelos.view;

import java.awt.Color;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import es.vuelos.model.Vuelo;



public class VuelosView {
	
	private JFrame frame;
	private JPanel panel;
	private JLabel nombreVueloLabel;
	private JLabel origenLabel;
	private JLabel destinoLabel;
	private JLabel horaSalidaEstimadaLabel;
	private JLabel horaArriboEstimadaLabel;
	private JLabel duracionVueloDiasLabel;

	public void view(List<Vuelo> vuelos) {
		int i = 1;
		for (Vuelo vuelo : vuelos) {
			frame = new JFrame("Vuelo " + i + ": " + vuelo.getNombreVuelo());
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			panel = new JPanel();
			nombreVueloLabel = new JLabel("Nombre del vuelo: " + vuelo.getNombreVuelo() + "\n");
			nombreVueloLabel.setOpaque(true);
			nombreVueloLabel.setBackground(Color.WHITE);
			origenLabel = new JLabel("Origen: " + vuelo.getOrigen() + "\n");
			origenLabel.setOpaque(true);
			origenLabel.setBackground(Color.GREEN);
			destinoLabel = new JLabel("Destino: " + vuelo.getDestino() + "\n");
			destinoLabel.setOpaque(true);
			destinoLabel.setBackground(Color.GREEN);
			horaSalidaEstimadaLabel = new JLabel("Hora de salida estimada: " + vuelo.getHoraSalidaEstimada() + "\n");
			horaSalidaEstimadaLabel.setOpaque(true);
			horaSalidaEstimadaLabel.setBackground(Color.WHITE);
			horaArriboEstimadaLabel = new JLabel("Hora de arribo estimada: " + vuelo.getHoraArriboEstimada() + "\n");
			horaArriboEstimadaLabel.setOpaque(true);
			horaArriboEstimadaLabel.setBackground(Color.WHITE);
			duracionVueloDiasLabel = new JLabel("Duración del vuelo (en dias): " + vuelo.duracionVueloDias() + "\n");
			duracionVueloDiasLabel.setOpaque(true);
			duracionVueloDiasLabel.setBackground(Color.CYAN);
			panel.add(nombreVueloLabel);
			panel.add(origenLabel);
			panel.add(destinoLabel);
			panel.add(horaSalidaEstimadaLabel);
			panel.add(horaArriboEstimadaLabel);
			panel.add(duracionVueloDiasLabel);
			frame.getContentPane().add(panel);
			frame.pack();
			frame.setVisible(true);
			i++;
		}
		

	}
}