package es.vuelos.controller;

import es.vuelos.model.VuelosModel;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class VuelosController {
	
	private VuelosModel VuelosModel;
	
	public void getVuelos() {
		VuelosModel.generarVuelos();
	
	}

}
