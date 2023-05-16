package es.vuelos;

import es.vuelos.controller.VuelosController;
import es.vuelos.model.VuelosModel;
import es.vuelos.view.VuelosView;

public class AppVuelos {

	public static void main(String[] args) {
		
		VuelosController vuelosController = new VuelosController(
				new VuelosModel(new VuelosView()));
		vuelosController.getVuelos();

	}
	

}
