import java.util.Scanner;

public class SacaPar {

	public static void main(String[] args) {
		/*
		 * Realiza la clase Java Sacapar que lee un número entero 
		 * por teclado y muestra los números pares,
		 * desde 0 hasta él inclusive. Con While.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un nº");
	    int numero = scanner.nextInt();
	    
	    int contador = 0 ;
	    while (contador<=numero) {
	    	
	    	if(contador%2==0) {
	    		System.out.println(contador);
	    	}
			contador++;
			
		}
	    
	}

}
