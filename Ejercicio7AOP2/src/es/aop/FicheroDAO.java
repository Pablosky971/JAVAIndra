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
	public void leerFichero() {
		try
		
		{
			Set<String> lineas = new HashSet<>();
			String nombreArchivo = "FICHERO_AOP.txt";
			String rutaNombreArchivo =  nombreArchivo;
			File documento = new File(rutaNombreArchivo);
			BufferedReader lector = new BufferedReader(new FileReader(documento));
			String caracteres = "";
			while((caracteres = lector.readLine()) != null)
			{
		
				lineas.add(caracteres);
				
			
		}
			int i = 1;
			for(String linea : lineas) {
				System.out.println("Línea " + i + ": " + linea+"\n"); 
				i++;
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
			
		}
		
	}

}
