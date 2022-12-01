package funciones;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio14 {
	/*4. Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá recibir 
	 * dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo. 
	 * */
	public static void triangulo(char c,int n) 
	{
		int i=1;
		
		int numVecesEspacios=0;
		int numVecesChar=1;
		while(i<=n)
		{
			
			numVecesEspacios=n-i;
			while(numVecesChar!=0) {
				
				while(numVecesEspacios!=0)
				{
					System.out.print(" ");
					numVecesEspacios--;
				}
				
				System.out.print(c);
				numVecesChar--;
			}
			System.out.println();
			numVecesChar=(i*2)+1;
			i++;
			
			
		}
	}
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		char c;
		int n;
		
		System.out.println("Dame caracter:");
		c = (char) System.in.read();
		
		System.out.println("Dame numero lineas:");
		n = scanner.nextInt();
		
		triangulo(c, n);
		scanner.close();
	}

}
