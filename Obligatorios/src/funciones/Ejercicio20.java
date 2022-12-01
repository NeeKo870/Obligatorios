package funciones;

public class Ejercicio20 {
	/*20. Escribe un programa que imprima las tablas de multiplicar del 1 al 10. 
	 * Implementa una función que reciba un número entero como parámetro e imprima su tabla de multiplicar
	 * */
	public static void tablaMultiplicar(int n) 
	{
		for (int i = 1; i <=10; i++) {
			System.out.println(n + " x " + i + ": " + i*n);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
	
		for (int i = 1; i <=10; i++) {
			tablaMultiplicar(i);
		}

	}

}
