package es.aop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class FicheroDAO {
	public Set<String> leerFichero() {
		try
		
		{
			Set<String> lineas = new HashSet<>();
			String ruta = "C:\\Users\\pcallep\\Desktop\\GT3_JAVA\\Ejercicio7AOP2\\";
			String nombreArchivo = "FICHERO_AOP.txt";
			String rutaNombreArchivo = ruta + nombreArchivo;
			File documento = new File(rutaNombreArchivo);
			BufferedReader lector = new BufferedReader(new FileReader(documento));
			String caracteres = "";
			while((caracteres = lector.readLine()) != null)
			{
				System.out.println(caracteres);
				lineas.add(caracteres);
			}
			return lineas;
		}
		catch (IOException e)
		{
			e.printStackTrace();
			return null;
		}
		
	}

}
