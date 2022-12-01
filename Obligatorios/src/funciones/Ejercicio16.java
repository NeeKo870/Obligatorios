package funciones;

import java.util.Scanner;

public class Ejercicio16 {
	/*16. Escribe un programa que cree un array del tamaño indicado por teclado y luego lo rellene con 
	 * valores aleatorios (utiliza Math.random()). Implementa la función que rellena un array con 
	 * valores aleatorios.
	 * */ 

	public static void relleArrAle(double arr[]) 
	{
		for (int i = 0; i < arr.length; i++) {
			arr[i]= Math.random();		
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int tamanio;
		
		System.out.println("Dame tamaño:");
		tamanio = scanner.nextInt();

		double arr1[]= new double[tamanio];
		relleArrAle(arr1);
		for (double d : arr1) {
			System.out.println(d);
		}
		
		scanner.close();
	}

}
