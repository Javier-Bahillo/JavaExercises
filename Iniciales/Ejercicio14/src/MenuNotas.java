import java.util.Scanner;

public class MenuNotas {

	public static void main(String[] args) {
		/*
		 * Realiza la clase Java Menunotas que lee por teclado la nota de un 
		 * alumno y muestra su calificación siguiendo la tabla del ejercicio 
		 * Tabnotas usando una estructura selectiva.
		 */

		
		int nota = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nota");
		nota = sc.nextInt();
		
		switch (nota) {
		case 0:
		case 1:
		case 2: 
			System.out.println("El resultado de la nota " + nota + " es MD");
			break;
		case 3:
		case 4:
			System.out.println("El resultado de la nota " + nota + " es INS");
			break;
		case 5:
			System.out.println("El resultado de la nota " + nota + " es SUF");
			break;
		case 6:
			System.out.println("El resultado de la nota " + nota + " es BIEN");
			break;
		case 7:
		case 8:
			System.out.println("El resultado de la nota " + nota + " es NOT");
			break;
		case 9:
		case 10:
			System.out.println("El resultado de la nota " + nota + " es SOBRE");
			break;
		default:
			System.out.println("El resultado de la nota no existe");
			break;
		}
		
	}

}
