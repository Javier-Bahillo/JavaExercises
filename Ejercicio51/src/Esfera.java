import java.util.Scanner;

public class Esfera {
	
	/*
	 * Diseña una función que calcule y muestre 
	 * la superficie y el volumen de una,esfera.
	 * 4 * pi * r(cuadrado) 4/3 * pi * r(cubo)
	 * radio
	 */
	
	
	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Introduzca el radio de la esfera");
		 double radio1 = sc.nextDouble();
		 //double superficie = 4 * Math.PI * Math.pow(radio, 2);
		 calcularSuperficie(radio1);
		 //double volumen = 4.0/3.0 * Math.PI * Math.pow(radio, 3);
		 calcularVolumen(radio1);
//		 System.out.println("La superficie es : " + superficie);
//		 System.out.println("El volumen es : " + volumen);
	}
	
	static void calcularSuperficie(double radio2) {
		double superficie = 0.0;
		superficie = 4 * Math.PI * Math.pow(radio2, 2);
		System.out.println("La superficie es : " + superficie);
	}
	
	static void calcularVolumen(double radio2) {
		double volumen = 0.0;
		volumen = 4.0/3.0 * Math.PI * Math.pow(radio2, 3);
		System.out.println("El volumen es : " + volumen);
		}

}