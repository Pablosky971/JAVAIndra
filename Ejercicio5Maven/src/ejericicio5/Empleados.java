package ejericicio5;

import org.json.JSONArray;
import org.json.JSONObject;

public class Empleados {

	public static void main(String[] args) {
		
		JSONArray empleados = generarEmpleadosJSON();
		System.out.println(empleados);

	}
	
	public static JSONArray generarEmpleadosJSON() {
		JSONObject empleado1 = new JSONObject();
		empleado1.put("nombre", "Pablosky");
		empleado1.put("apellido", "Calle");
		empleado1.put("ciudad", "Utrera");
		empleado1.put("edad", 25);
		empleado1.put("email", "pablosky@gmail.com");
		
		JSONObject empleado2 = new JSONObject();
		empleado2.put("nombre", "Marco");
		empleado2.put("apellido", "Fernández");
		empleado2.put("ciudad", "Sevilla");
		empleado2.put("edad", 24);
		empleado2.put("email", "marco@gmail.com");
		
		JSONObject empleado3 = new JSONObject();
		empleado3.put("nombre", "Miguel");
		empleado3.put("apellido", "Reyes");
		empleado3.put("ciudad", "Jaén");
		empleado3.put("edad", 24);
		empleado3.put("email", "miguel@gmail.com");
		
		JSONArray empleados = new JSONArray();
		empleados.put(empleado1);
		empleados.put(empleado2);
		empleados.put(empleado3);
		
		return empleados;
		
	}

}
