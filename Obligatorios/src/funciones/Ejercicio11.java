package funciones;

import java.util.Scanner;

public class Ejercicio11 {
	/*11. Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado. 
	 * Para ello implementa una función que reciba como parámetro un número entero y muestre por 
	 * pantalla la tabla de multiplicar de dicho número. 
	 * */
	public static void tablaMultiplicar(int n) 
	{
		for (int i = 1; i <=10; i++) {
			System.out.println(n + " x " + i + ": " + i*n);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		
		System.out.println("Dame numero:");
		n = scanner.nextInt();
		
		tablaMultiplicar(n);;
		scanner.close();
	}

}
