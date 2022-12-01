package funciones;

import java.util.Scanner;

public class Ejercicio2 {
	/*2. Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad 
	 * o no. Implementa y utiliza la función: 
	 *  boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
	 */
	public static boolean esMayorEdad(int a)
	{
		if(a>=18) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int edad;
		
		System.out.println("Dame edad:");
		edad = scanner.nextInt();

		if(esMayorEdad(edad)) {
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("Es menor de edad");
		}
		scanner.close();
	}

}
