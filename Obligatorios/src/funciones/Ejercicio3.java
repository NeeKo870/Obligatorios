package funciones;

import java.util.Scanner;

public class Ejercicio3 {
	/*3. Escribe un programa que pida dos n�meros enteros por teclado y muestre por pantalla cual es 
	 * el m�nimo. Implementa y utiliza la funci�n: 
	 * int minimo(int a, int b) // Devuelve el menor entre a y b
	 * */
	public static int minimo(int a, int b) {
		if(a<b) {
			return a;
		}else {
			return b;
		}
			
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Dame a:");
		a = scanner.nextInt();
		
		System.out.println("Dame b:");
		b = scanner.nextInt();
		
		System.out.println("El menor de " + a +" y " + b +" es " + minimo(a, b));
		scanner.close();
	}

}
