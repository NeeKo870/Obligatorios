package funciones;

import java.util.Scanner;

public class Ejercicio13 {
	/*13. Realiza un programa que calcule el porcentaje de descuento que nos han hecho al comprar algo. 
	 * Se debe solicitar la cantidad sin descuento y la cantidad con el descuento aplicado. Se debe crear 
	 * una función a la que le pasemos ambos valores y nos devuelva el descuento.
	 * */
	public static double calcularDescuento(double a,double b) 
	{
		double descuento=(a-b)/a*100;
		return descuento;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Dame cantidad sin descuento:");
		a = scanner.nextDouble();
		
		System.out.println("Dame cantidad con el descuento:");
		b = scanner.nextDouble();
		
		System.out.println("El descuento aplicado es " + calcularDescuento(a, b) + "%");
		scanner.close();
	}

}
