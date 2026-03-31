import java.util.Iterator;
import java.util.Scanner;

public class Factoria {

	public static void main(String[] args) {
		/*
		 * Realiza la clase Java Factoria que lee 
		 * un número por teclado y calcula su factorial.
		 */

		int numero = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un nº para calcular su factorial");
		numero = sc.nextInt();
		
		int factorial = 1;
		for (int i = 1; i <= numero; i++) {
			factorial = factorial * i;
			System.out.println("El factorial actual" + i + " es = " + factorial);
		}
		
		System.out.println("El factorial final es = " + factorial);
	}

}
