package ejercicio1;

public class Calculadora {

	public int suma(int a, int b) {
		int res = a + b;
		return res;
	}

	public int resta(int a, int b) {
		int res = a - b;
		return res;
	}

	public int multiplicar(int a, int b) {
		int res = a * b;
		return res;
	}

	public int dividir(int a, int b) {
		int res = 0;
		try {
			if (b == 0.0) {
				throw new Exception("No se puede dividir por cero");
			}
			res = a / b;
			return res;
		} catch (Exception e) {
			System.out.println("No se permite la división entre cero");
			return res;
		}

	}

}
