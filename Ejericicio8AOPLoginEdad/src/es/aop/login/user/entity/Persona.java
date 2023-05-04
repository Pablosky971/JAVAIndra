package es.aop.login.user.entity;

import java.time.LocalDate;
import java.time.Period;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Persona implements IPersona {
	
	protected String nombre;
	protected String apellido;
	protected LocalDate fechaNacimiento;
	
	@Override
	public Integer edad() {
		
		return Period.between(fechaNacimiento,LocalDate.now()).getYears();
	}
	
	
}
