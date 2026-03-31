import java.util.Iterator;
import java.util.Scanner;

public class Numprimo {

	public static void main(String[] args) {
		/*
		 * Realiza la clase Java Numprimo que lee un número 
		 * por teclado y muestra por pantalla si el número es o no primo.
		 */

		int numero = 0;
		boolean esPrimo = true;
		System.out.println("Introduzca un nº para verificar que es primo");
		Scanner sc = new Scanner(System.in);
		
		numero = sc.nextInt();
		
		for (int i = 2; i < numero; i++) {
			
			if (numero % i == 0) {
				esPrimo=false;
				
			}
		}
//		if(esPrimo)
//		System.out.println("El nº introducido es Primo");
//		else {
//		System.out.println("El nº introducido no es Primo");
//		}
		//condicion ? [valor true] : [valor false] 
		System.out.println("El numero " + numero + (esPrimo ? " es Primo" : " no es Primo" ));
		
	}

}
