package basicos18;

import java.util.Scanner;

/**
 *
 * Ejercicio 7: Programa que lee un valor correspondiente a una distancia
 *              en millas marinas y escriba la distancia en metros. Sabiendo 
 *              que una milla marina equivale a 1.852 metros. 
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double millas, metros;
        
        System.out.print("Introduce el número de millas marinas: ");
        millas = entrada.nextDouble();
        
        metros = millas * 1852;
        
        System.out.println("La distancia equivale a " + metros + " metros");
        
    }
    
}
