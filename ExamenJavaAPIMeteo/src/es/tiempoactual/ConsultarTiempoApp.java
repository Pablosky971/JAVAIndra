package es.tiempoactual;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONObject;

import es.tiempoactual.model.TiempoCiudad;

public class ConsultarTiempoApp {

	public static void main(String[] args) {
		List<TiempoCiudad> tiempoCiudades = new ArrayList<>();
		tiempoCiudades.add(getTiempoCiudadBarcelona());
		tiempoCiudades.add(getTiempoCiudadBuenosAires());
		tiempoCiudades.add(getTiempoCiudadMadrid());
		tiempoCiudades.add(getTiempoCiudadBerlin());
		
		imprimirTiempoCiudades(tiempoCiudades);
		

	}

	public static TiempoCiudad getTiempoCiudadBarcelona()  {

		String nombreCiudad = "Barcelona";
		Double temperaturaCelsius = 0.0;
		try {
			URL url = new URL("https://api.open-meteo.com/v1/forecast?latitude=41.39&longitude=2.16&hourly=temperature_2m&current_weather=true&forecast_days=1");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			int tiempoDeRespuesta = con.getResponseCode();
			
			if (tiempoDeRespuesta != 200) {
				
				throw new RuntimeException("HttpResponseCode" + tiempoDeRespuesta);
				
			} 
			
			
			else {
				StringBuilder infoTiempoCiudad= new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext()) {
					infoTiempoCiudad.append(sc.nextLine());
				}
				sc.close();

				JSONObject jsonTiempoCiudad = new JSONObject(infoTiempoCiudad.toString());
				temperaturaCelsius = Double.parseDouble(jsonTiempoCiudad.getJSONObject("hourly").getJSONArray("temperature_2m").get(11).toString());
				

			}
		}
			
		 catch (IOException e) {
			e.printStackTrace();
		}
		 return new TiempoCiudad(nombreCiudad, temperaturaCelsius);
		
	}
	public static TiempoCiudad getTiempoCiudadBuenosAires()  {

		String nombreCiudad = "Buenos Aires";
		Double temperaturaCelsius = 0.0;
		try {
			URL url = new URL("https://api.open-meteo.com/v1/forecast?latitude=-34.61&longitude=-58.38&hourly=temperature_2m&current_weather=true&forecast_days=1");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			int tiempoDeRespuesta = con.getResponseCode();
			
			if (tiempoDeRespuesta != 200) {
				
				throw new RuntimeException("HttpResponseCode" + tiempoDeRespuesta);
				
			} 
			
			
			else {
				StringBuilder infoTiempoCiudad= new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext()) {
					infoTiempoCiudad.append(sc.nextLine());
				}
				sc.close();

				JSONObject jsonTiempoCiudad = new JSONObject(infoTiempoCiudad.toString());
				temperaturaCelsius = Double.parseDouble(jsonTiempoCiudad.getJSONObject("hourly").getJSONArray("temperature_2m").get(11).toString());
				

			}
		}
			
		 catch (IOException e) {
			e.printStackTrace();
		}
		 return new TiempoCiudad(nombreCiudad, temperaturaCelsius);
		
	}
	public static TiempoCiudad getTiempoCiudadMadrid()  {

		String nombreCiudad = "Madrid";
		Double temperaturaCelsius = 0.0;
		try {
			URL url = new URL("https://api.open-meteo.com/v1/forecast?latitude=40.42&longitude=-3.70&hourly=temperature_2m&current_weather=true&forecast_days=1");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			int tiempoDeRespuesta = con.getResponseCode();
			
			if (tiempoDeRespuesta != 200) {
				
				throw new RuntimeException("HttpResponseCode" + tiempoDeRespuesta);
				
			} 
			
			
			else {
				StringBuilder infoTiempoCiudad= new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext()) {
					infoTiempoCiudad.append(sc.nextLine());
				}
				sc.close();

				JSONObject jsonTiempoCiudad = new JSONObject(infoTiempoCiudad.toString());
				temperaturaCelsius = Double.parseDouble(jsonTiempoCiudad.getJSONObject("hourly").getJSONArray("temperature_2m").get(11).toString());
				

			}
		}
			
		 catch (IOException e) {
			e.printStackTrace();
		}
		 return new TiempoCiudad(nombreCiudad, temperaturaCelsius);
		
	}
	public static TiempoCiudad getTiempoCiudadBerlin()  {

		String nombreCiudad = "Berlín";
		Double temperaturaCelsius = 0.0;
		try {
			URL url = new URL("https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m&current_weather=true&forecast_days=1");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			int tiempoDeRespuesta = con.getResponseCode();
			
			if (tiempoDeRespuesta != 200) {
				
				throw new RuntimeException("HttpResponseCode" + tiempoDeRespuesta);
				
			} 
			
			
			else {
				StringBuilder infoTiempoCiudad= new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext()) {
					infoTiempoCiudad.append(sc.nextLine());
				}
				sc.close();

				JSONObject jsonTiempoCiudad = new JSONObject(infoTiempoCiudad.toString());
				temperaturaCelsius = Double.parseDouble(jsonTiempoCiudad.getJSONObject("hourly").getJSONArray("temperature_2m").get(11).toString());
				

			}
		}
			
		 catch (IOException e) {
			e.printStackTrace();
		}
		 return new TiempoCiudad(nombreCiudad, temperaturaCelsius);
		
	}
	
	public static void imprimirTiempoCiudades(List<TiempoCiudad> tiempoCiudades) {
		int i = 1;
		for(TiempoCiudad tiempoCiudad : tiempoCiudades) {
			System.out.println("Ciudad " + i + ": " + tiempoCiudad.getNombreCiudad());
			System.out.println("Temperatura actual: " + tiempoCiudad.getTemperaturaCelsius() + " ºC");
			
			switch(tiempoCiudad.recomendacionAbrigo()) {
			case NO_ABRIGAR:
				System.out.println("Recomendación: No usar mudas de ropa pesada.\n");
				break;
			case ABRIGAR:
				System.out.println("Recomendación: Abrigarse.\n");
				break;
			case A_DEFINIR: 
				System.out.println("Recomendación: Use la ropa que prefiera.\n");
			}
				
			i++;
		}
	}
}
