package funciones;

import java.util.Scanner;

public class Ejercicio18 {
	/*1. Escribe un programa que pida dos n�meros reales por teclado y muestre por pantalla el 
	 * resultado de multiplicarlos. Implementa y utiliza la funci�n: 
	 * double multiplica(double a, double b) // Devuelve la multiplicaci�n de dos n�meros 
	 */
	public static double multiplica(double a,double b) 
	{
		return a * b;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Dame a:");
		a = scanner.nextDouble();
		
		System.out.println("Dame b:");
		b = scanner.nextDouble();
		
		System.out.println("La multiplicacion de " + a +"*"+b+" es " + multiplica(a, b));
		scanner.close();
	}

}
