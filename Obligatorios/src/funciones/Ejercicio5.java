package funciones;

import java.util.Scanner;

public class Ejercicio5 {
	/*5. Escribe un programa que pida un valor entero en millas y muestre su equivalente en kil�metros. 
	 * Recuerda que una milla son 1,60934 kil�metros. Implementa y utiliza la funci�n: 
	 *  double millas_a_kilometros(int millas) // Devuelve la conversi�n de millas a kil�metros 
	 * */
	public static double millas_a_kilometros(int millas)
	{	
		return millas *1.60934;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int millas;
		
		System.out.println("Dame millas:");
		millas = scanner.nextInt();
		
		System.out.printf("La conversion de " + millas + " millas a killometros es " + String.format("%.2f", millas_a_kilometros(millas)) + " km");
		scanner.close();
	}
	

}
