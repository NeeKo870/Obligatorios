package funciones;

import java.util.Scanner;

public class Ejercicio10 {
	/*10. Realiza un programa que lea una fecha introduciendo el día, mes y año por separado 
	 * y nos diga si la fecha es correcta o no. Supondremos que todos los meses tienen 30 días. 
	 * Se debe crear una función donde le pasemos los datos y devuelva si es correcta o no.
	 * */
	public static boolean fechaCorrecta(int dia,int mes,int anio) 
	{
		boolean correcta=true;
		if((dia>30||dia<0)||(mes>12||mes<0)||(anio<0)) 
		{
			correcta=false;
		}

		return correcta;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int dia, mes,anio;
		
		System.out.println("Dame dia:");
		dia = scanner.nextInt();
		
		System.out.println("Dame mes:");
		mes = scanner.nextInt();
		
		System.out.println("Dame anio:");
		anio = scanner.nextInt();
		
		if(fechaCorrecta(dia, mes, anio)) {
			System.out.println("Es correcta");
		}else {
			System.out.println("Es incorrecta");
		}
		scanner.close();
	}

}
