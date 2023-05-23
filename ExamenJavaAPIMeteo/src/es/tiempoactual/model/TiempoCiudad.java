package es.tiempoactual.model;

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
public class TiempoCiudad implements ITiempoCiudad {
	private String nombreCiudad;
	private Double temperaturaCelsius;

	@Override
	public RecomendacionAbrigo recomendacionAbrigo() {

		if (temperaturaCelsius > 10)
			return RecomendacionAbrigo.NO_ABRIGAR;
		else if (temperaturaCelsius < 10)
			return RecomendacionAbrigo.ABRIGAR;
		else
			return RecomendacionAbrigo.A_DEFINIR;
	}

}
