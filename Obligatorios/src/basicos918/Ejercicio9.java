package basicos918;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame edad:");
		int edad = teclado.nextInt();
		
		if(edad >= 18) {
			System.out.println("Eres mayor de edad");
		}else 
		{
			System.out.println("Eres menor de edad");
		}
		teclado.close();

	}

}
