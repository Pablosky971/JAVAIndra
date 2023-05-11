package es.spotify.api.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import es.spotify.api.model.Artista;

public class InfoArtistas {
	public static void main(String[] args) {
		escribirFicheroArtistas();
	}
	
	public static void escribirFicheroArtistas() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Indique el número de artistas que quiere registrar: ");
		int numeroArtistas = scanner.nextInt();
		List<Artista> artistas = new ArrayList<>();
		for(int i=1;i<=numeroArtistas;i++) {
			
			System.out.println("Nombre del artista: " + "\n");
			String nombre = scanner.next();
			System.out.println("Género musical: " + "\n");
			String genero = scanner.next();
			System.out.println("Cantidad de reproducciones: " + "\n");
			int cantidadReproducciones = scanner.nextInt();
			System.out.println("País donde se escucha más: " + "\n");
			String paisMayorEscucha = scanner.next();
			
			
			artistas.add(new Artista(nombre, genero, cantidadReproducciones, paisMayorEscucha));
		}
		scanner.close();
		try {
			String ruta = "C:\\Users\\pcallep\\Documents\\";
			String nombreArchivo = "artistas.txt";
			String rutaNombreArchivo = ruta + nombreArchivo;
			
			File archivoFile = new File(rutaNombreArchivo);
			
		
			if(!archivoFile.exists()) {
				
			
				archivoFile.createNewFile();
				
			
			FileWriter fw = new FileWriter(archivoFile);
			BufferedWriter bufferedWriter = new BufferedWriter(fw);
			int n = 1;
			for(Artista artista  : artistas) {
				bufferedWriter.write("==========================================" + "\n");
				bufferedWriter.write("Artista " + n + ": "  + artista.getNombreArtista() + "\n");
				bufferedWriter.write("==========================================" + "\n");
				bufferedWriter.write("Nombre del artista: " + artista.getNombreArtista() + "\n");
				bufferedWriter.write("Género musical: " + artista.getGenero() + "\n");
				bufferedWriter.write("Cantidad de reproducciones: " + artista.getCantidadReproducciones() + "\n");
				bufferedWriter.write("País donde más se escucha: " + artista.getPaisMayorEscucha() + "\n");
				bufferedWriter.write("Recaudación monetaria: " + artista.recaudacionMonetaria() + "\n");
				bufferedWriter.write("Proyección anual: " + artista.proyeccionAnual() + "\n");
				n++;
		}
	
			bufferedWriter.close();
			System.out.println("¡El fichero con la información de los artistas se ha creado con éxito!");
			}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
	}

}
