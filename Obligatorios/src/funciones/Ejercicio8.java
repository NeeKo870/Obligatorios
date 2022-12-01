package funciones;

import java.util.Scanner;

public class Ejercicio8 {
	/*8. Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N, el 
	 * productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las funciones: 
	 * int suma1aN(int n) // Devuelve la suma de enteros de 1 a n 
	 * int producto1aN(int n) // Devuelve el producto de enteros de 1 a n 
	 * double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n 
	 * */
	public static int suma1aN(int n) {
				
		 int cont=1;
		 int suma=1;
		 while(cont!=n) {
			cont++;
			suma+=cont;
		 }
		return suma;
	}
	public static int producto1aN(int n) {
		int cont=1;
		int producto=1;
		while(cont!=n) {
			cont++;
			producto*=cont;
		}
		return producto;
	}
	public static double intermedio1aN(double n)
	{		
		return n/2;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Dame numero:");
		numero = scanner.nextInt();
		
		System.out.println("Sumatorio de 1 a " + numero + " es " + suma1aN(numero));
		System.out.println("Producto de 1 a " + numero + " es " + producto1aN(numero));
		System.out.println("Valor intermedio de 1 a " + numero + " es " + intermedio1aN((double)numero));
		scanner.close();
	}

}
