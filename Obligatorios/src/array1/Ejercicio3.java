package array1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double arrEnteros[] = new double[10];

		//rellenamos el array con lo que nos da el usuario
		for(int i=0;i<arrEnteros.length;i++) {
			System.out.println("Dime el numero " + (i+1) +": ");
			arrEnteros[i]=teclado.nextDouble();
		}
		
		//recorremos el array buscando el mas pequeño
		double min =arrEnteros[0];
		double max =arrEnteros[0];
		for(int i=0;i<arrEnteros.length;i++) {
			
			if(min>arrEnteros[i]) {
				min=arrEnteros[i];
			}else if(max<arrEnteros[i]) {
				max=arrEnteros[i];
			}
			
		}
		//Eco por pantalla
		System.out.println();
		System.out.println("Min: " +min);
		System.out.println("Max: " +max);
		
		
	}
}
