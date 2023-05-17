package es.homebanking.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Producto {
	
	private String numeroTarjeta;
	private Double saldo;
	private LocalDate fechaVencimiento;
	
	public Producto() {
		this.numeroTarjeta = "ES-" + Math.random() * 10000000;
		this.saldo = 3000.00;
		this.fechaVencimiento = LocalDate.now().plusMonths(5);
	}
	
	

}
