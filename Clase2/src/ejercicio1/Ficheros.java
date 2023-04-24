package ejercicio1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ficheros {
	public static void main(String[] args) {
		try {
		String ruta = "C:\\Users\\pcallep\\Documents\\";
		String nombreArchivo = "salida.txt";
		String rutaNombreArchivoString = ruta + nombreArchivo;
		String contenido = "Hola, ¿Qué tal?";
		File archivoFile = new File(rutaNombreArchivoString);
		
		// Manejo de excepciones al manejar archivos.
		if(!archivoFile.exists()) {
			
		
			archivoFile.createNewFile();
			System.out.println("¡Se creo el fichero!");
		
		FileWriter fw = new FileWriter(archivoFile);
		BufferedWriter bufferedWriter = new BufferedWriter(fw);
		bufferedWriter.write(contenido);
		bufferedWriter.close();
		}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
			

	
}
}