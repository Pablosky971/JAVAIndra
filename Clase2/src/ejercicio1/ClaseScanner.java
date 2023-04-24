package ejercicio1;

import java.util.Scanner;

public class ClaseScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Se toman valores por consola.
		System.out.println("Ingrese el primer número: ");
		int numero = scanner.nextInt();
		System.out.println("Ingrese el segundo número: ");
		int numero2 = scanner.nextInt();
		
		System.out.println("Indique la operación que quiere realizar: \n"
				+ "1. Suma \n"
				+ "2. Resta \n"
				+ "3. Producto \n"
				+ "4. División"); // \n salto de línea.
		int menu = scanner.nextInt();
		
		
		Calculadora calculadora  = new Calculadora();
		if(menu==1) {
			
			System.out.println("El resultado de la suma es: " + calculadora.suma(numero, numero2));
			
		}
		if(menu==2){
			
			System.out.println("El resultado de la resta es: " + calculadora.resta(numero, numero2));
			
		}
		if(menu==3){
			
			System.out.println("El resultado de la multiplicación es: " + calculadora.multiplicar(numero, numero2));
			
		}
		if(menu==4) {
			calculadora.dividir(numero, numero2);
			System.out.println("El resultado de la división es: " + calculadora.dividir(numero, numero2));
		}
			
		else {
			System.out.println("No ha introducido un valor correcto");
		}
		scanner.close(); //Siempre que se abre, después se cierra.
		

		
	}
	

}
