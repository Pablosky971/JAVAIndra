package ejercicio2;

import java.time.LocalDate;

public class Empleado extends Persona implements SalarioNeto{
	private String posicion;
	private double salario;
	private LocalDate fechaIngreso;
	
	
	public Empleado(String posicion, double salario, LocalDate fechaIngreso) {
		super();
		this.posicion = posicion;
		this.salario = salario;
		this.fechaIngreso = fechaIngreso;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	@Override
	public double salarioNeto(double salarioBruto) {
		
		return salarioBruto * 0.80;
	}


}
