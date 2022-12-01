package basicos918;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame hora:");
		int hora = teclado.nextInt();
		
		System.out.println("Dame minutos:");
		int minutos = teclado.nextInt();
		
		System.out.println("Dame segundos:");
		int segundos = teclado.nextInt();
		segundos++;
		
		if(segundos > 59) 
		{
			segundos=0;
			minutos++;
			if(minutos > 59) 
			{
				minutos=00;
				if(hora==23) {
					hora=0;
				}else{
					hora++;
				}
			}else{
				minutos++;
			}
		}
		
		if(hora<10) 
		{
			System.out.print("0" + hora + ":");			
		}else 
		{
			System.out.print(hora + ":");
		}
		
		if(minutos<10)
		{
			System.out.print("0" + minutos + ":");
		}else
		{
			System.out.print(minutos + ":");
		}
		
		if(segundos<10)
		{
			System.out.print("0" + segundos);
		}else
		{
			System.out.print(segundos);
		}

		teclado.close();
		
		
		

		
	}

}
