package basicos918;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame numero 1:");
		int num1 = teclado.nextInt();
		
		System.out.println("Dame numero 2:");
		int num2 = teclado.nextInt();
		
		System.out.println("Dame numero 3:");
		int num3 = teclado.nextInt();
		
		if(num1 > num2) 
		{
			if(num1 > num3) {
				System.out.println(num1+ " es el mayor");
			}else 
			{
				System.out.println(num3+ " es el mayor");
			}
			
		}else
		{
			if(num2 > num3) {
				System.out.println(num2+ " es el mayor");
			}else 
			{
				System.out.println(num3+ " es el mayor");
			}
		}
		teclado.close();
	}

}
