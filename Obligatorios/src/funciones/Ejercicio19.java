package funciones;

import java.util.Scanner;

public class Ejercicio19 {
	/*19. Realiza un programa que permita comprobar si una terna de valores enteros (3 valores) se ajusta 
	 * a la ecuaci�n de Pit�goras: x � + y � = z �. El programa solicita al usuario los valores x, y, z. Se 
	 * deber� crear una funci�n a la que se le pase x, y, z y devuelva si son iguales o no. Por ejemplo: 3 � + 4 � = 5 �. 
	 * */	
	public static boolean pitagoras(int x,int y,int z) 
	{
		if(Math.pow(z, 2)==(Math.pow(x, 2)+Math.pow(y, 2))) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x,y,z;
		
		System.out.println("Dame x:");
		x = scanner.nextInt();
		
		System.out.println("Dame y:");
		y = scanner.nextInt();
		
		System.out.println("Dame z:");
		z = scanner.nextInt();

		if(pitagoras(x, y, z)) {
			System.out.println("Es correcta");
		}else {
			System.out.println("Es incorrecta");
		}
		scanner.close();
	}

}
