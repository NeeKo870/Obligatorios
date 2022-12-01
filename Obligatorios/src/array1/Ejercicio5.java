package array1;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double arrEnteros[] = new double[20];
		double acum= 0.0; 
		 
		//rellenamos el array con lo que nos da el usuario
		for(int i=0;i<arrEnteros.length;i++) {
			System.out.println("Dime el numero " + (i+1) +": ");
			arrEnteros[i]=teclado.nextDouble();
		}
		//recorremos el array acumulando los datos de cada celda, calculamos el sumatorio y lo dividimos entre el num valores y lo sacamos por pantalla
	
		for(int i=0;i<arrEnteros.length;i++) {
			
			acum+=arrEnteros[i];
			
		}
		
		System.out.println("Media: "+ acum/20);

	}
}
