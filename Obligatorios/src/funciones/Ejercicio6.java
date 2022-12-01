package funciones;

import java.util.Scanner;

public class Ejercicio6 {
	/*6. Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada 
	 * uno tras aplicarle un 21% de IVA. Implementa y utiliza la función: 
	 * double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA 
	 * */
	public static double precioConIVA(double precio) {
		return precio+(precio*0.21);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double precios[]=new double[5];
		for (int j = 0; j < precios.length; j++) {
			System.out.println("Dame precio "+(j+1)+":");
			precios[j]= scanner.nextDouble();	
		}
		
		for (int j = 0; j < precios.length; j++) {
			System.out.println("Precio "+(j+1) +" con IVA:" +precioConIVA(precios[j]));
		}
		scanner.close();
	}

}
