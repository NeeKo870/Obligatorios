package funciones;

import java.util.Scanner;

public class Ejercicio9 {
   /* 9 Realiza un programa que pida introducir tres valores enteros y nos diga cu�l de ellos es el m�s 
	* elevado. Implem�ntalo creando �nicamente una funci�n a la que le pasemos dos valores (no 
	* tres) y nos devuelva el m�ximo de los dos valores. 
	* */
	public static int mayor3(int a,int b) 
	{
		if(a>b) {
			return a;
		}else {
			return b;
		}	
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Dame a:");
		a = scanner.nextInt();
		
		System.out.println("Dame b:");
		b = scanner.nextInt();
		
		System.out.println("Dame c:");
		c = scanner.nextInt();
		System.out.println("El mayor es " + mayor3(mayor3(a,b),c) );
		
		scanner.close();
	}

}
