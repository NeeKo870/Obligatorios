package basicos918;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame numero:");
		int num = teclado.nextInt();
		if (num >=0)
		{
			System.out.println("Positivo");
		}else
		{
			System.out.println("Negativo");
		}
		teclado.close();
	}

}
