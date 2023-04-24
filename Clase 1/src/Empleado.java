
public class Empleado extends Persona implements Calculos{
	
	private String cargo;
	private int sueldo;

public static void main(String args[]) {
	Empleado pablosky = new Empleado();
	pablosky.nombre="Pablosky";
	pablosky.apellido="Calle";
	pablosky.edad=24;
	pablosky.altura=1.93;
	pablosky.cargo="Ing. inf. software";
	pablosky.sueldo=23000;
	
	System.out.println("El nombre del empleado es: " + pablosky.nombre);
	
	
}


@Override
public double suma(double a, double b) {
	double res = a+b;
	return res;
}

@Override
public double resta(double a, double b) {
	double res = a-b;
	return res;
}

@Override
public double multiplicar(double a, double b) {
	double res = a*b;
	return res;
}

@Override
public double dividir(double a, double b) {
	double res = a/b;
	return res;
}
}


