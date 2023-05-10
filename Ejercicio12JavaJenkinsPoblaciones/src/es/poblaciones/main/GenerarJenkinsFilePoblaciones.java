package es.poblaciones.main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import es.poblaciones.model.Ciudad;

public class GenerarJenkinsFilePoblaciones {

	public static void main(String[] args) {
		escribirFicheroFileJenkins();
		

	}
	
	public static List<Ciudad> generarCiudades() {
		List<Ciudad> ciudades = new ArrayList<>();
		ciudades.add(new Ciudad("Barcelona", 100000));
		ciudades.add(new Ciudad("Madrid", 1000000));
		ciudades.add(new Ciudad("Málaga", 50000));
		ciudades.add(new Ciudad("Sevilla", 80000));
		return ciudades;
		}
	public static void escribirFicheroFileJenkins() {
		List<Ciudad> ciudades = generarCiudades();
		try (
				PrintWriter writer = new PrintWriter(new FileWriter("Jenkinsfile")))
			{
			String inicioContenidoJenkinsFile = 
					"pipeline {\n" +
	                        "    agent any\n" +
	                        "    stages {\n";
	                       
				writer.write(inicioContenidoJenkinsFile);
				for(Ciudad ciudad : ciudades) {
					String stageCiudad =  "stage(\""+ ciudad.getNombreCiudad()+ "\") {\n" +
	                        "            steps {\n" +
	                        "                script {\n" +
	                        "                    println \"La ciudad ${" + ciudad.getNombreCiudad() + "}, tiene una población final de: "  + ciudad.poblacionTotal() + " habitantes." + "\"\n" +
	                        "                }\n" +
	                        "            }\n" +
	                        "        }\n";
					writer.write(stageCiudad);
					
				}
				String finContenidoJenkinsFile = 
						"        }\n" +
						"        }\n";
				writer.write(finContenidoJenkinsFile);
			} 
			
			catch (IOException e) {
				
				e.printStackTrace();
			}

		
	}

}
