import java.util.Iterator;
import java.util.Scanner;

public class Numveces {

	public static void main(String[] args) {
		/*
		 * Realiza la clase Java Numveces que pide números de 0 a 9 por pantalla
		 * y calcula el número de veces que han sido introducidos utilizando un array.
		 * Finaliza la introducción de datos cuando se introduce un valor negativo o 
		 * el array está lleno. Al finalizar la introducción de datos muestra 
		 * por pantalla el número de veces que se ha introducido cada número.
		 */

		int[] numeros = new int[10];
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int i = 0;
		int[] contador = new int[10];
//		int contadorDe0 = 0;
//		int contadorDe1 = 0;
//		int contadorDe2 = 0;
//		int contadorDe3 = 0;
//		int contadorDe4 = 0;
//		int contadorDe5 = 0;
//		int contadorDe6 = 0;
//		int contadorDe7 = 0;
//		int contadorDe8 = 0;
//		int contadorDe9 = 0;
		do {
			System.out.println("Introduce 10 nº del 0 al 9 o un negativo para finalizar");
			numero = sc.nextInt();
			//guardar nº en array
			if (numero>=0 && numero<10) {
				numeros[i]=numero;
				i++;
				contador[numero]++;
			}
			
			
		} while (numero>=0 && i<numeros.length);
		
		for (int j = 0; j < contador.length; j++) {
			System.out.println("Hay " + contador[j] + " de este numero " + j);
		}
		
//		for (int j = 0; j < numeros.length; j++) {
//			
//			switch (numeros[j]) {
//			case 0: contadorDe0++;
//					break;
//			case 1: contadorDe1++;
//					break;
//			case 2: contadorDe2++;
//					break;
//			case 3: contadorDe3++;
//					break;
//			case 4: contadorDe4++;
//					break;
//			case 5: contadorDe5++;
//					break;
//			case 6: contadorDe6++;
//					break;
//			case 7: contadorDe7++;
//					break;
//			case 8: contadorDe8++;
//					break;
//			case 9: contadorDe9++;
//					break;
//				
//			}
//		}
//	
//		System.out.println("Hay "+ contadorDe0 + " nº de 0");
//		System.out.println("Hay "+ contadorDe1 + " nº de 1");
//		System.out.println("Hay "+ contadorDe2 + " nº de 2");
//		System.out.println("Hay "+ contadorDe3 + " nº de 3");
//		System.out.println("Hay "+ contadorDe4 + " nº de 4");
//		System.out.println("Hay "+ contadorDe5 + " nº de 5");
//		System.out.println("Hay "+ contadorDe6 + " nº de 6");
//		System.out.println("Hay "+ contadorDe7 + " nº de 7");
//		System.out.println("Hay "+ contadorDe8 + " nº de 8");
//		System.out.println("Hay "+ contadorDe9 + " nº de 9");
//		
//
//hacerlo con while y la otra forma
	}
}
