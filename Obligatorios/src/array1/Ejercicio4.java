package array1;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int arrEnteros[] = new int[20];
		int acumPos = 0; 
		int acumNeg = 0; 
		//rellenamos el array con lo que nos da el usuario
		for(int i=0;i<arrEnteros.length;i++) {
			System.out.println("Dime el numero " + (i+1) +": ");
			arrEnteros[i]=teclado.nextInt();
		}
		//recorremos el array acumulando los datos de cada celda y lo sacamos por pantalla
	
		for(int i=0;i<arrEnteros.length;i++) {
			if(arrEnteros[i]>=0) {
				acumPos+=arrEnteros[i];
			}else {
				acumNeg+=arrEnteros[i];
			}
			
			
		}
		
		System.out.println("Positivos: "+ acumPos);
		System.out.println("Negativos: "+ acumNeg);
	}
}
