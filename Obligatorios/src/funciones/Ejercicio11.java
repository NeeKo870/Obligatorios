package funciones;

import java.util.Scanner;

public class Ejercicio11 {
	/*11. Realiza un programa que escriba la tabla de multiplicar de un n�mero introducido por teclado. 
	 * Para ello implementa una funci�n que reciba como par�metro un n�mero entero y muestre por 
	 * pantalla la tabla de multiplicar de dicho n�mero. 
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
