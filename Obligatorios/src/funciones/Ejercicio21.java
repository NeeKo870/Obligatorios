package funciones;

import java.util.Scanner;

public class Ejercicio21 {
	/*21. Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y “2.Área”. 
	 * En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo oportuno. 
	 * Implementa las funciones: 
	 * 		int menu() // Muestra el menú y devuelve el número elegido 
	 * 		double pideRadio() // Pide que se introduzca el radio y lo devuelve
	 * 		double circunferencia(double r) // Calcula la circunferencia y la devuelve 
	 * 		double area(double r) // Calcula el área y la devuelve 
	 * 
	 * Modifica el programa añadiendo otra opción llamada “Volumen”, permitiendo que el usuario 
	 * también pueda solicitar el cálculo del volumen. Añade la función: 
	 * 		double volumen(double r) // Calcula el volumen y lo devuelve 
	 * Modifica el programa añadiendo otra opción llamada “Todas” en la que se pida el radio una sola vez 
	 * y se muestren los tres cálculos posibles (circunferencia, área y volumen). 
	 * 
	 * Modifica el programa anterior de modo que el proceso se repita una y otra vez (mostrar menú -> 
	 * realizar el cálculo -> volver a mostrar menú). Añade una opción más llamada “Salir” que terminará 
	 * el programa si es elegida.
	 */
	public static void menu( Scanner scan ) {
		int numEleg=0;
		while(numEleg!=5) {
			System.out.println("1.Circunferencia\n"+
							   "2.Área\n"+
							   "3.Volumen\n"+
							   "4.Todas\n"+
							   "5.Salir");
			numEleg=scan.nextInt();
			
			switch (numEleg) {
			case 1: {
				
				double perimetro=circunferencia(pideRadio(scan));
				System.out.printf("El perimetro de la circunferencia es %.2f\n",perimetro);
				break;
			}
			case 2: {
				double area=area(pideRadio(scan));
				System.out.printf("El area de la circunferencia es %.2f\n",area);
				break;
			}
			case 3: {
				double volumen=volumen(pideRadio(scan));
				System.out.printf("El volumen de la circunferencia es %.2f\n",volumen);
				break;
			}
			case 4: {
				double radio=pideRadio(scan);
				double perimetro=circunferencia(radio);
				System.out.printf("El perimetro de la circunferencia es %.2f\n",perimetro);
				double area=area(radio);
				System.out.printf("El area de la circunferencia es %.2f\n",area);
				double volumen=volumen(radio);
				System.out.printf("El volumen de la circunferencia es %.2f\n",volumen);
				break;
			}
			case 5: {
				System.out.println("Fin");
				break;
			}
			default:
				System.out.println("Del 1 al 5");
				break;
			}
		}
	}
	public static double pideRadio(Scanner scan) {
		System.out.println("Dame radio de la circunferencia");
		return scan.nextDouble();
	}
	public static double circunferencia(double r) {
		return (2*Math.PI)*r;
	}
	public static double area(double r)
	{
		return Math.PI*Math.pow(r, 2);
	}
	public static double volumen(double r) {
		return ((4/3)*Math.PI)*Math.pow(r, 3);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		menu(scanner);
		scanner.close();
	}

}
