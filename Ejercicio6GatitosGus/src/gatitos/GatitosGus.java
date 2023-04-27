package gatitos;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class GatitosGus {
	public static void main(String[] args) {
		
		try {
		URL url = new URL("https://api.thecatapi.com/v1/images/search");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.connect(); 
		int tiempoDeRespuesta = con.getResponseCode();
		if (tiempoDeRespuesta != 200)
		{
			throw new RuntimeException("HttpResponseCode" + tiempoDeRespuesta);			
		}
		else
		{
			StringBuilder informacion = new StringBuilder();
			Scanner sc = new Scanner(url.openStream());
			while (sc.hasNext())
			{
				informacion.append(sc.nextLine());
			}
			sc.close();
			
			// Eliminamos los corchetes
			informacion.deleteCharAt(0);
			informacion.deleteCharAt(informacion.length()-1);
			
			JSONObject jsonGatito = new JSONObject(informacion.toString());
			String urlImagenRandomGatito= jsonGatito.getString("url");
			System.out.println("La URL del gatito es: " + urlImagenRandomGatito);
		} 
	} catch(IOException e) {
		e.printStackTrace();
	}

}
}
