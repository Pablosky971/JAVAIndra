package es.vuelos.model;

import java.time.Duration;
import java.time.LocalDateTime;

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
public class Vuelo implements IVuelo{
	private String nombreVuelo;
	private String origen;
	private String destino;
	private LocalDateTime horaSalidaEstimada;
	private LocalDateTime horaArriboEstimada;
	
	@Override
	public Integer duracionVueloDias() {
		 
		return (int) Duration.between(horaSalidaEstimada, horaArriboEstimada).toDays();
	}

}
