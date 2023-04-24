package ejercicio1;

public class Arrays {
	public static void main(String[] args) {
		int[] numeros= {1,2,3,4,5,6,7,8,9};
		System.out.println(numeros[0]);
		int arrayLargo = numeros.length;
		System.out.println("El largo del array es: " + arrayLargo);
		
		String[] nombres = new String[10];
		nombres[0]="Gustavo";
		nombres[1]="Pablo";
		nombres[2]="Marco";
		nombres[3]="Juan";
		System.out.println("El nombre de la osición inicial es: " + nombres[0]);
		
		for(int i =0; i < numeros.length; i++) {
			System.out.println("Los números dle array son: " + numeros[i]);
		}
	}

}
