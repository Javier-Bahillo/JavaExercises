import java.util.Scanner;

public class SumanUm {

	public static void main(String[] args) {
		/*
		 * Realiza la clase Java Sumanum que lee un numero entero 
		 * por teclado y muestra la suma de todos 
		 * los números hasta el inclusive. Con While.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un nº");
	    int numero = scanner.nextInt();
	    
	    int contador = 0;
	    int suma = 0;
	    while (contador<=numero) {
	    	
	    	
	    	//System.out.println(suma);
	    	suma=suma+contador;
			contador++;

		
	    
	    }

	    System.out.println("La suma total es: " + suma);
	    	
	}

}
