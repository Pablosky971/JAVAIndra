package es.spotify.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Artista implements IArtista {

	private String nombreArtista;
	private String genero;
	private Integer cantidadReproducciones;
	private String paisMayorEscucha;

	@Override
	public Double recaudacionMonetaria() {

		return cantidadReproducciones * 0.02;
	}

	@Override
	public Double proyeccionAnual() {

		return recaudacionMonetaria() * 12;
	}

}
