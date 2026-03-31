import java.util.Iterator;
import java.util.Scanner;

public class Sumanumf {

	public static void main(String[] args) {
		
		/*
		 * Realiza la clase Java Sumanumf que lee un numero
		 *  entero por teclado y muestra la suma de todos 
		 *  los números hasta el inclusive. Con For.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un nº");
	    int numero = scanner.nextInt();
	    
	    int suma = 0;
	    
	    for (int i = 0; i <= numero; i++) {
			suma=suma+i;	    	
	    
	    }

	    System.out.println("La suma total es: " + suma);
	    	
	}

}
