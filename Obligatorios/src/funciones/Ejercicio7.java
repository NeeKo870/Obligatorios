package funciones;

import java.util.Scanner;

public class Ejercicio7 {
	/*7. Escribe un programa que pida el ancho y alto de un rect�ngulo y muestre por pantalla su �rea y 
	 * su per�metro. Implementa y utiliza las funciones: 
	 * double perimetroRectangulo(double ancho, double alto) // Devuelve el per�metro 
	 * double areaRectangulo(double ancho, double alto) // Devuelve el �rea 
	 * */
	public static double perimetroRectangulo(double ancho, double alto) {		
		return 2*(ancho+alto);
	}
	public static double areaRectangulo(double ancho, double alto) {
		return ancho*alto;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double ancho, alto;
		
		System.out.println("Dame ancho:");
		ancho = scanner.nextDouble();
		
		System.out.println("Dame alto:");
		alto = scanner.nextDouble();
		
		System.out.println("El perimetro del rectangulo es " + perimetroRectangulo(ancho, alto));
		System.out.println("El area del rectangulo es " + areaRectangulo(ancho, alto));
		scanner.close();
	}

}
