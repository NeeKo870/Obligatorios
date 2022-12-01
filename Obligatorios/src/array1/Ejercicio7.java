package array1;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Pedimos P y Q
		int num1,num2;
		int arrEnteros[];
		do {
			System.out.println("Dime el num1: ");
			num1=teclado.nextInt();
			System.out.println("Dime el num2: ");
			num2=teclado.nextInt();
		}while(num1==num2);
		
		//Ponemos el tamaño calculando cuantos numeros hay entre los dos valores
		
		if(num1<num2) {
			arrEnteros = new int[(num2-num1)-1];
		}else {
			arrEnteros = new int[(num1-num2)-1];
		}
		
		
		//recorremos el array poniendole los valores en todas sus posiciones
	
		for(int i=0;i<arrEnteros.length;i++) {
			
			if(num1<num2) {
				num1++;
				arrEnteros[i] = num1;
			}else {
				num2++;
				arrEnteros[i] = num2;
			}
			
		}
		//Imprimimos el array
		System.out.println("Array");
		for(int i=0;i<arrEnteros.length;i++) {
			System.out.print(arrEnteros[i]+" ");
			
		}

	}
}
