package ejercicio1;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fechas {
	public static void main(String[] args) {
		LocalDate fechaActual=LocalDate.now();
		System.out.println(fechaActual);
		
		LocalDate fechaNacimiento = LocalDate.of(1997, 2, 14);
		
		int edad = fechaActual.getYear() - fechaNacimiento.getYear();
		int edadDias = fechaActual.getDayOfYear();
		System.out.println("Analizando getDayOfYear " + edadDias);
		System.out.println("La edad del sujeto es : " + edad);
		
		// Manejo de métodos con fechas
		
		LocalDate fechaHoyDate = LocalDate.now();
		LocalDate fechaAyerDate = fechaHoyDate.minusDays(1);
		LocalDate fechaMañanaDate = fechaHoyDate.plusDays(1);
		
		System.out.println("La fecha de hoy es: " + fechaHoyDate);
		System.out.println("La fecha de ayer es: " + fechaAyerDate);
		System.out.println("La fecha de mañana es: " + fechaMañanaDate);
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
												// yyyy-MM-dd
												// dd/MM/YYYY
		LocalDateTime fechaActualHoraDateTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatterHoras = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");										
		String fechaFormateadaString = fechaHoyDate.format(dateTimeFormatter);
		String fechaFormateadaStringHora = fechaActualHoraDateTime.format(dateTimeFormatterHoras);
		System.out.println("La fecha formateada es: " + fechaFormateadaString);
		System.out.println("La fecha con horas formateada: " + fechaFormateadaStringHora);
	}

}
