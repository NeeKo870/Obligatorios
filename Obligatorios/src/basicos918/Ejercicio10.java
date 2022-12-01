package basicos918;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame numero 1:");
		int num1 = teclado.nextInt();
		
		System.out.println("Dame numero 2:");
		int num2 = teclado.nextInt();
		
		int suma,resta,producto,division=0;
		
		suma = num1 + num2;
		
		resta = num1 - num2;
		
		producto= num1 * num2;
		
		if(num2==0) {
			System.out.println("No se puede dividir entre cero");
		}else {
			division=num1 / num2;
		}
		System.out.println("Suma: " + suma +" \n" + "Resta: " + resta +" \n" + "Producto: " + producto +" \n" + "Division: " + division +" \n");
		teclado.close();
	}

}
