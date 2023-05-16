package es.vuelos.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import es.vuelos.view.VuelosView;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class VuelosModel {
	private VuelosView vuelosView;
	public void generarVuelos() {
		List<Vuelo> vuelos = new ArrayList<>();
		vuelos.add(new Vuelo("Caribean Destination", "Barcelona", "El Caribe", LocalDateTime.of(2023, 5, 23, 18, 35, 0,0),LocalDateTime.of(2023, 5, 24, 21, 35, 0)));
		vuelos.add(new Vuelo("Hawai Destination", "Sevilla", "Hawai", LocalDateTime.of(2023, 5, 24, 17, 35, 0,0),LocalDateTime.of(2023, 5, 26, 21, 55, 0)));
		vuelos.add(new Vuelo("Argentina Destination", "Madrid", "Santa Fe", LocalDateTime.of(2023, 5, 26, 18, 35, 0,0),LocalDateTime.of(2023, 5, 27, 04, 35, 0)));
		vuelosView.view(vuelos);;
	}
	
	
	

}
