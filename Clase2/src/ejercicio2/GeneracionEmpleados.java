package ejercicio2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeneracionEmpleados {
	public static void main(String[] args) {
		
		
		List<Empleado> empleados = new ArrayList<>();
		//List<Double> salariosNetos = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántos empleados desea registrar? ");
		int numeroEmpleados = sc.nextInt();
		for(int i = 0; i<numeroEmpleados; i++) {
		System.out.println("Empleado " + i + " :");
		System.out.println("Indique el nombre: ");
		String nombre = sc.next();
		System.out.println("Indique el apellido: ");
		String apellido = sc.next();
		System.out.println("Indique la ciudad donde reside: ");
		String ciudad = sc.next();
		System.out.println("Indique la edad: ");
		int edad = sc.nextInt();
		System.out.println("Indique la posición actual: ");
		String posicion = sc.next();
		System.out.println("Indique el salario bruto actual: ");
		double salarioBruto = sc.nextDouble();
		System.out.println("Indique el día del mes que ingreso (formato dd)");
		int day = sc.nextInt();
		System.out.println("Indique el mes que ingreso (formato mm)");
		int month = sc.nextInt();
		System.out.println("Indique el año que ingreso (formato yyyy)");
		int year = sc.nextInt();
		LocalDate fechaIngreso = LocalDate.of(year, month, day);
		
		Empleado e = new Empleado(posicion, salarioBruto, fechaIngreso);
		e.setNombre(nombre);
		e.setApellido(apellido);
		e.setCiudad(ciudad);
		e.setEdad(edad);
		
		empleados.add(e);
		
		
	}
		sc.close();
		
		try {
			String ruta = "C:\\Users\\pcallep\\Documents\\";
			String nombreArchivo = "empleados.txt";
			String rutaNombreArchivo = ruta + nombreArchivo;
			File archivo = new File(rutaNombreArchivo);
			
			// Manejo de excepciones al manejar archivos.
			if(!archivo.exists()) {
				
			
				archivo.createNewFile();
				System.out.println("¡Se creo el fichero!");
			
			FileWriter fw = new FileWriter(archivo);
			BufferedWriter bufferedWriter = new BufferedWriter(fw);
			for(Empleado empleado : empleados) {
			bufferedWriter.write("Empleado " + empleado.getNombre() + " " + empleado.getApellido()+ "\n");
			bufferedWriter.write("Edad: " + empleado.getEdad() + "\n");
			bufferedWriter.write("Ciudad: " + empleado.getCiudad() + "\n");
			bufferedWriter.write("Posición: " + empleado.getPosicion() + "\n");
			bufferedWriter.write("Salario bruto: " + empleado.getSalario() + "\n");
			bufferedWriter.write("Salario neto: " + empleado.salarioNeto(empleado.getSalario()) + "\n");
			
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");										
			String fechaFormateada = empleado.getFechaIngreso().format(dateTimeFormatter);
			bufferedWriter.write("Fecha de ingreso: " + fechaFormateada + "\n");
			LocalDate fechaHoy = LocalDate.now();
			String fechaHoyFormateada= fechaHoy.format(dateTimeFormatter);
			bufferedWriter.write("Fecha de hoy: " + fechaHoyFormateada + "\n");
			}
			bufferedWriter.close();
			
			
	}
			
}
		catch(IOException e) {
			e.printStackTrace();
		}
}
}