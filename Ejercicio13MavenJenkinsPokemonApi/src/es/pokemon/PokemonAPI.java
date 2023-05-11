package es.pokemon;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import java.util.Scanner;

import javax.naming.NameNotFoundException;

import org.json.JSONObject;

import es.pokemon.model.Pokemon;

public class PokemonAPI {
	public static void main(String[] args)  {
		writeFileInfoPokemon(); 
	}

	public static Pokemon getPokemonByName(String namePokemon)  {

		String name = null;
		String type = null;
		Integer weight = null;
		try {
			URL url = new URL("https://pokeapi.co/api/v2/pokemon/" + namePokemon);
			System.out.println(url);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			int tiempoDeRespuesta = con.getResponseCode();
			
			if (tiempoDeRespuesta != 200) {
				
				throw new RuntimeException("HttpResponseCode" + tiempoDeRespuesta);
				
			} 
			
			
			else {
				StringBuilder infoPokemon = new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext()) {
					infoPokemon.append(sc.nextLine());
				}
				sc.close();

				JSONObject jsonPokemon = new JSONObject(infoPokemon.toString());
				name = jsonPokemon.getJSONObject("species").getString("name");
				type = jsonPokemon.getJSONArray("types").getJSONObject(0).getJSONObject("type").get("name").toString();
				weight = jsonPokemon.getInt("weight");

			}
		}
			
		 catch (IOException e) {
			e.printStackTrace();
		}
		 return new Pokemon(name, type, weight);
		
	}

	public static void writeFileInfoPokemon()  {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Ingrese el nombre del pokemon que desea consultar: ");
		String namePokemon = scanner.next();
		Pokemon pokemon = getPokemonByName(namePokemon);
		scanner.close();
		try {
			String ruta = "C:\\Users\\pcallep\\Documents\\";
			String nombreArchivo = "pokemon.txt";
			String rutaNombreArchivo = ruta + nombreArchivo;
			
			File archivoFile = new File(rutaNombreArchivo);
			
		
			if(!archivoFile.exists()) {
				
			
				archivoFile.createNewFile();
				
			
			FileWriter fw = new FileWriter(archivoFile);
			BufferedWriter bufferedWriter = new BufferedWriter(fw);
			String name = pokemon.getName();
			String type = pokemon.getType();
			Integer weight = pokemon.getWeight();
			
			bufferedWriter.write("Pokemon: \n");
			bufferedWriter.write("Nombre: " + name + "\n");
			bufferedWriter.write("Tipo: " + type + "\n");
			bufferedWriter.write("Peso: " + weight + "\n");
			bufferedWriter.close();
			}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
				
		
		
		
		

	}
}
