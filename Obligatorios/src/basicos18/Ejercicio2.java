package basicos18;

public class Ejercicio2 {
	public static void main(String[] args) {
        int areaCuadrado;
        
        areaCuadrado = 5 * 5;
        
        System.out.println("(sin constante)El �rea del cuadradado es " + areaCuadrado);
        
        // Soluci�n usando una constante
        final int lado = 5;
        
        areaCuadrado = lado * lado;
        
        System.out.println("(con constante)El �rea del cuadradado es " + areaCuadrado);
	}
}
