package array1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double arrEnteros[] = new double[10];
		//rellenamos el array con lo que nos da el usuario
		for(int i=0;i<arrEnteros.length;i++) {
			System.out.println("Dime el numero " + (i+1) +": ");
			arrEnteros[i]=teclado.nextDouble();
		}
		//Imprimimos el array
		System.out.println("Array");
		for(int i=0;i<arrEnteros.length;i++) {
			System.out.print(arrEnteros[i]+" ");
			
		}
	}
}
