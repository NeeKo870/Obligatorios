package basicos918;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame numero 1:");
		int num1 = teclado.nextInt();
		
		System.out.println("Dame numero 2:");
		int num2 = teclado.nextInt();
		
		if(num1 >= num2) 
		{
			if(num1==num2) {
				System.out.println(num1 + " es igual a " + num2);
			}else {
				System.out.println(num2+"\n"+num1);
			}
			
		}else
		{
			System.out.println(num1+"\n"+num2);
		}
		teclado.close();

	}

}
