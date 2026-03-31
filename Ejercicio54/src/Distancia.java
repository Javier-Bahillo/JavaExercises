import java.util.Scanner;

public class Distancia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Implementa la función,public static double distancia
		 * (duoble xl, double yl, double x2, double y2)
		 * que calcula y devuelve la distancia euclídea que 
		 * separa los puntos (x1, y1) y (x2, y2).
		 *  La fórmula para calcular esta distancia es:
		 *  
		 *  distancia = √(x1 − x2)(al cuadrado) + (y1 − y2)(al cuadrado)
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Calcula la distancia de los valores x1,x2,y1,y2");
		System.out.println("Introduce el valor x1");
		double x1 = sc.nextDouble();
		System.out.println("Introduce el valor x2");
		double x2 = sc.nextDouble();
		System.out.println("Introduce el valor y1");
		double y1 = sc.nextDouble();
		System.out.println("Introduce el valor y2");
		double y2 = sc.nextDouble();
		double distancia1 = calcularDistancia(x1,x2,y1,y2);
		//System.out.println("La distancia es " + calcularDistancia(x1,x2,y1,y2));
		System.out.println("La distancia es " + distancia1);
		
	}
	
	public static double calcularDistancia(double x1, double y1, double x2, double y2) {
		double distancia2 = Math.sqrt(Math.pow(x1 - x2, 2) + (Math.pow(y1 - y2, 2)));
	return distancia2;
	}

}
