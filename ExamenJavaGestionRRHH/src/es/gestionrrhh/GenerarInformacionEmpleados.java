package es.gestionrrhh;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import es.gestionrrhh.model.Empleado;
import es.gestionrrhh.model.Puesto;
import es.gestionrrhh.model.Sexo;

public class GenerarInformacionEmpleados {

	public static void main(String[] args) {
		List<Empleado> empleados = generarEmpleados();
		imprimirInformacionEmpleados(empleados);
		
		
	}

	public static List<Empleado> generarEmpleados() {
		List<Empleado> empleados = new ArrayList<>();
		empleados.add(new Empleado("Pablo", "Calle", LocalDate.of(2021, 04, 12), LocalDate.of(2045, 04, 12), Sexo.MASCULINO,
				"Sevilla", Puesto.INGENIERO, 1500.0));
		empleados.add(new Empleado("Marco", "Fernández", LocalDate.of(2022, 04, 06), LocalDate.of(2023, 04, 06), Sexo.MASCULINO,
				"Sevilla", Puesto.INGENIERO, 1700.0));
		empleados.add(new Empleado("Miguel", "Reyes", LocalDate.of(2021, 04, 11), LocalDate.of(2023, 04, 11), Sexo.MASCULINO,
				"Sevilla", Puesto.INGENIERO, 1500.0));
		return empleados;
		
	}
	public static void imprimirInformacionEmpleados(List<Empleado> empleados) {
		try {
			String ruta = "C:\\Users\\pcallep\\Documents\\"; // Establezca su ruta del directorio de salida del fichero aquí
			String nombreArchivo = "empleados.json";
			String rutaNombreArchivo = ruta + nombreArchivo;
			File ficheroEmpleados= new File(rutaNombreArchivo);
			
	
				
			
				ficheroEmpleados.createNewFile();
				System.out.println("¡Se ha generado el fichero .json de los empleados!");
			
			FileWriter fw = new FileWriter(ficheroEmpleados);
			BufferedWriter bufferedWriter = new BufferedWriter(fw);
			bufferedWriter.write("[" + "\n");
			int i = 1;
			for(Empleado empleado : empleados) {
				bufferedWriter.write("{" + "\n");
				System.out.println("Empleado " + i + ":");
				System.out.println("Nombre del empleado: " + empleado.getNombre());
				bufferedWriter.write("\"nombre\": " + "\"" + empleado.getNombre() + "\"," + "\n");
				
				System.out.println("Apellido del empleado: " + empleado.getApellido());
				bufferedWriter.write("\"apellido\": " + "\"" + empleado.getApellido() + "\"," + "\n");
				
				System.out.println("Fecha de ingreso: " + empleado.getFechaIngreso());
				bufferedWriter.write("\"fechaIngreso\": " + "\"" + empleado.getFechaIngreso() + "\"," + "\n");
				
				System.out.println("Fecha de salida: " + empleado.getFechaSalida());
				bufferedWriter.write("\"fechaSalida\": " + "\"" + empleado.getFechaSalida() + "\"," + "\n");
				
				System.out.println("Sexo del empleado: " + empleado.getSexo());
				bufferedWriter.write("\"sexo\": " + "\"" + empleado.getSexo() + "\"," + "\n");
				
				System.out.println("Posición del empleado: " + empleado.getPosicion());
				bufferedWriter.write("\"posicion\": " + "\"" + empleado.getPosicion() + "\"," + "\n");
				
				System.out.println("Salario base del empleado: " + empleado.getSalarioBase());
				bufferedWriter.write("\"salarioBase\": " + "\"" + empleado.getSalarioBase() + "\"," + "\n");
				
				System.out.println("Salario final del empleado: " + empleado.calcularSalario());
				bufferedWriter.write("\"salarioFinal\": " + "\"" + empleado.calcularSalario() + "\"," + "\n");
				
				System.out.println("Antigüedad laboral del empleado: " + empleado.antiguedadLaboral());
				bufferedWriter.write("\"antiguedadLaboral\": " + "\"" + empleado.antiguedadLaboral() + "\"," + "\n");
				
				System.out.println("Rotación recomendada del empleado: " + empleado.rotacionRecomendada());
				bufferedWriter.write("\"rotacionRecomendada\": " + "\"" + empleado.rotacionRecomendada() + "\"" + "\n");
				if(empleados.lastIndexOf(empleado)==empleados.size()-1) bufferedWriter.write("}" + "\n");
				else bufferedWriter.write("}," + "\n");
				i++;
			}
			bufferedWriter.write("]");
			bufferedWriter.close();
			
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		
	}
}
