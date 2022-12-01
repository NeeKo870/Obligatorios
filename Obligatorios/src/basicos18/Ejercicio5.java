package basicos18;


import java.util.Scanner;

/**
 *
 * Ejercicio 5: Programa que toma como dato de entrada un n�mero que corresponde
 * a la longitud de un radio y nos escribe la longitud de la circunferencia, el
 * �rea del c�rculo y el volumen de la esfera que corresponden con dicho radio.
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double radio, circunferencia, area, volumen;

        System.out.print("Introduce el radio: ");
        radio = entrada.nextDouble();

        // No hace falta crearse una constante PI ya que Math.PI lo es.
        circunferencia = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);
        volumen = 4 / 3 * Math.PI * Math.pow(radio, 3);

        System.out.println("La longitud es " + circunferencia);
        System.out.println("El �rea es " + area);
        System.out.println("El volumen de la esfera es " + volumen);
    }

}
