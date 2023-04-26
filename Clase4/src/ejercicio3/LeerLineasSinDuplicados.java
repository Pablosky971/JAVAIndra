package ejercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class LeerLineasSinDuplicados {

	public static void main(String[] args) throws IOException {

		// Almacenamos líneas sin duplicados añadiéndolas al conjunto.
		Set<String> nombres = new HashSet<>();
		try {

			String ruta = "C:\\Users\\pcallep\\Documents\\";
			String nombreArchivo = "Nombres.txt";
			String rutaNombresArchivo = ruta + nombreArchivo;

			File archivo = new File(rutaNombresArchivo);

			// Manejo de excepciones al manejar archivos.
			if (!archivo.exists()) {

			}
			BufferedReader lector = new BufferedReader(new FileReader(archivo));
			String linea = "";
			while ((linea = lector.readLine()) != null) {
				nombres.add(linea);

			}
			lector.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		// Imprimimos nombres sin duplicados:
		System.out.println("Nombres recogidos en el fichero: ");
		int i = 1;
		for (String nombre : nombres) {
			System.out.println(i + ". " + nombre);
			i++;
		}

	}
}