import java.util.Scanner;

public class Sumanumd {

	public static void main(String[] args) {
		/*
		 * Realiza la clase Java Sumanumd que modifica Sumanumw 
		 * para que si el número entero que se lee 
		 * por teclado es negativo siga pidiendo números 
		 * hasta que se introduzca un número positivo.
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un nº negativo");
		System.out.println("Introduce un nº positivo para salir");
		 int numero = 0;
	    
	    do {
		    numero = scanner.nextInt();
		} while (numero<=0);
	    System.out.println("Agur");
		
	}

}
