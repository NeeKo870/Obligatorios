package basicos18;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        float numero1, numero2, suma, resta, producto, division;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        numero1 = entrada.nextFloat();
        
        System.out.print("Introduce el segundo número: ");
        numero2 = entrada.nextFloat();
        
        suma = numero1 + numero2;
        resta = numero1 + numero2;
        producto = numero1 * numero2;
        division = numero1 / numero2; // No controlamos la división entre 0
        
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("El producto es " + producto);
    }
}
