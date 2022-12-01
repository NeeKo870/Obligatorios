package array1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Pedimos N y M
		System.out.println("Dime el tamaño: ");
		int tamanio=teclado.nextInt();
		System.out.println("Dime el numero: ");
		int numero=teclado.nextInt();
		int arrEnteros[] = new int[tamanio];
		//recorremos el array poniendole el numero en todas sus posiciones
	
		for(int i=0;i<arrEnteros.length;i++) {
			
			arrEnteros[i]=numero;
			
		}
		//Imprimimos el array
		System.out.println("Array");
		for(int i=0;i<arrEnteros.length;i++) {
			System.out.print(arrEnteros[i]+" ");
			
		}

	}
}
