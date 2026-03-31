import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		/*
		 * Realiza la clase Java Bisiesto que lee un año por teclado y 
		 * muestra por pantalla si es o no bisiesto. Un año es bisiesto si es
		 * múltiplo de 4 pero no lo es de 100 excepto si también es múltiplo de 400.
		 */

		System.out.println("Introducir nº de año para mostrar si es bisiesto o no");
		double anio = 0;
		Scanner sc = new Scanner(System.in);
		anio = sc.nextInt();
		
		if((anio%4==0 && anio%100 !=0) || anio%400==0) {
			System.out.println("El año " + anio + " es bisiesto");
		}else {
			System.out.println("El año " + anio + " no es bisiesto");
		}
	}

}
