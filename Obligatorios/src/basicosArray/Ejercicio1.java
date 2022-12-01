package basicosArray;

public class Ejercicio1 {
	public static void main(String[] args) {
		//1- Crear un array1 unidimensional de enteros de longitud 10 y rellenarlo con los números que van del 100 en adelante.
		int array1[]= new int[10];
		for(int i = 100,j=0;j<array1.length;i++,j++) {
			array1[j]=i;
		}
		
		//2- Crear un array2 unidimensional de enteros de longitud 20 y rellenarlo con los números que van del 20 hacia atrás.
		int array2[]= new int[20];
		for(int i = 20,j=0;j<array2.length;i--,j++) {
			array2[j]=i;
		}
		
		//3.- Crea un array3 unidimensional de longitud 30 rellenarlo con los 20 elementos del array2 seguidos de los 10 elementos del array1.
		int array3[]= new int[30];
		for(int j=0;j<array2.length;j++) {
			array3[j]=array2[j];
		}
		for(int j=array2.length,i =0;j<array3.length;j++,i++) {
			array3[j]=array1[i];
		}
		//4.- Busca la posición en la que se encuentra el número 5 en el array3
		for(int cont1 = 0;cont1< array3.length;cont1++) 
		{
			if(array3[cont1]==5) {
				System.out.println("Posicion: " + cont1);
			}
		}
		//5.- Rellena en el array2 desde la posición 5 a la posición 8 con el numero 99
		for(int i = 5;i<=8;i++) {
			array2[i]=99;
		}
		//6.- Copia en el array1 desde la posición 2, los 6 primeros elementos del array2﻿
		for(int i = 2,j=0;i<=8;i++,j++) {
			array1[i]=array2[j];
		}
		//7.- Mostrar los valores de los tres arrays.
		System.out.println("Array1: ");
		for(int j=0;j<array1.length;j++) {
			System.out.print(array1[j]+" ");
		}
		System.out.println("\nArray2: ");
		for(int j=0;j<array2.length;j++) {
			System.out.print(array2[j]+" ");
		}
		
		System.out.println("\nArray3: ");
		for(int j=0;j<array3.length;j++) {
			System.out.print(array3[j]+" ");
		}
	}
}
