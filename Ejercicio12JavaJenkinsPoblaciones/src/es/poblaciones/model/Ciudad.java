package es.poblaciones.model;

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
public class Ciudad implements ICiudad {
	private String nombreCiudad;
	private Integer poblacionParcial;
	
	@Override
	public Integer poblacionTotal() {
		/* Como la poblacion ha de ser un número entero,
		 en caso de decimales, redondeamos*/
		return (int) Math.round(poblacionParcial * 0.80);
		
		 
	}
	

	
}
