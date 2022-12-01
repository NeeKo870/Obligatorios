package basicos918;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame horas trabajadas:");
		final int hora = teclado.nextInt();
		
		System.out.println("Dame tarifa normal:");
		float tarifa = teclado.nextFloat();
		
		System.out.println("Dame nombre:");
		String nombre = teclado.next();
		
		int horasExtras=0;
		float salarioBase=0;
		if(hora > 35) {
			horasExtras=hora-35;
			float horasNormales=35*tarifa;
			float horasExtrasS=(float) (horasExtras*(tarifa*1.5));
			
			salarioBase=(float) horasExtrasS+horasNormales;
		}else {
			salarioBase=hora*tarifa;
		}
		float impuesto=0;
		if(salarioBase>900) 
		{
			
			impuesto=(float) ((400*025)+(salarioBase-900) * 0.45);
		
		}else
		{
			if(salarioBase>500) 
			{
				impuesto=(float) ((salarioBase-500) * 0.25);
				
				
			}
		}
		float salarioNeto=salarioBase-impuesto;
		System.out.println("Nombre\t"+"Salario Base\t"+"Impuesto\t"+"Salario Neto" );
		System.out.println(nombre+"\t"+salarioBase+"\t\t"+impuesto+"\t\t"+salarioNeto);
		teclado.close();
	}

}
