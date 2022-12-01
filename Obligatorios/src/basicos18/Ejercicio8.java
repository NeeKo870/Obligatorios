package basicos18;

import java.util.Scanner;

/**
 *
 * Ejercicio 8: Programa que pide la edad por teclado y nos muestra el mensaje
 * de “Eres mayor de edad” solo si lo somos.
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int edad;

        System.out.print("Introduce la edad: ");
        edad = entrada.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
    }

}
