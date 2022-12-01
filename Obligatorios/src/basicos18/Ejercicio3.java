package basicos18;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el lado: ");
        
        float lado = teclado.nextFloat(); 
        float areaCuadrado = lado * lado;        
        System.out.println("(sin constante)El área del cuadradado es " + areaCuadrado);
        
	}
}
