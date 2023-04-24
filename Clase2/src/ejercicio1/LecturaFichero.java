package ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LecturaFichero {

	public static void main(String[] args) throws IOException {
		// Primera forma: Con el Scanner.
		String ruta = "C:\\Users\\pcallep\\Documents\\";
		String nombreArchivo = "salida.txt";
		String rutaNombreArchivo = ruta + nombreArchivo;
		File archivo = new File(rutaNombreArchivo);
		try {
			Scanner scanner = new Scanner(archivo);
			while(scanner.hasNextLine()) {
				// Quedan líneas que leer
				System.out.println(scanner.nextLine()); // Imprime las líneas
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		// Segunda forma de leer fichero: Con el BufferedReader.
		
		try {
			BufferedReader lector = new BufferedReader(new FileReader(archivo));
			String caracteres = "";
			while((caracteres=lector.readLine())!=null) {
				
				System.out.println(caracteres);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
 	}
}
