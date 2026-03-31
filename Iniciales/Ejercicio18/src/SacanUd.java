import java.util.Scanner;

public class SacanUd {

	public static void main(String[] args) {
		/*
		 * Realiza la clase Java Sacanud que lee un 
		 * número entero por teclado y muestra los números desde él,
		 * inclusive hasta 1. Con While.
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un nº");
	    int numero = scanner.nextInt();
	    
	    int contador = numero ;
	    while (contador>=1) {
	    	
	    	System.out.println(contador);
			contador--;

		
	    
	    }

	    System.out.println("Hasta luego");
	    
	}

}
