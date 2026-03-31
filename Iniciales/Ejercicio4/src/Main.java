import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Realiza la clase Java Parimpar que lee el valor de un número 
		 * entero por teclado y muestra por pantalla si
			es par o impar.
		 */

		System.out.println("Introduce un nº entero");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		if(numero %2==0) {
			System.out.println("El nº " + numero + " es par");
		}else {
			System.out.println("El nº " + numero + " no es par");
		}
	}

}