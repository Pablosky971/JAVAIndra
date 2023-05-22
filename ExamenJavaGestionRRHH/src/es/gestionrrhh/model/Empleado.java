package es.gestionrrhh.model;

import java.time.LocalDate;
import java.time.Period;

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
public class Empleado implements IEmpleado {
	
	private String nombre;
	private String apellido;
	private LocalDate fechaIngreso;
	private LocalDate fechaSalida;
	private Sexo sexo;
	private String ciudad;
	private Puesto posicion;
	private Double salarioBase;

	@Override
	public double calcularSalario() {
		
		return salarioBase * 0.83;
	}

	@Override
	public int antiguedadLaboral() {
		
		return Period.between(fechaIngreso, fechaSalida).getYears();
	}

	@Override
	public Rotacion rotacionRecomendada() {
		Rotacion rotacionEmpleado;
		if(posicion==Puesto.INGENIERO && antiguedadLaboral() > 2) {
			rotacionEmpleado=Rotacion.ROTACION_HABILITADA;
		} else if(posicion==Puesto.INGENIERO && antiguedadLaboral() < 2) {
			rotacionEmpleado=Rotacion.ROTACION_NO_HABILITADA;
		} else {
			rotacionEmpleado=Rotacion.A_DEFINIR;		
		}
		return rotacionEmpleado;
	}

}
