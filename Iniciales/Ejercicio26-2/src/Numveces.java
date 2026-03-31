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
		int numero = 1;
		int i = 0;
		int[] contador = new int[10];
		
		//while
//		System.out.println("Introduce nº del 0 al 9");
//		numero = sc.nextInt();
		
		while (numero>0 && numero<10 && i<numeros.length) {
			System.out.println("Introduce nº del 0 al 9");
			numero = sc.nextInt();
			
			numeros[i] = numero;
			contador[numero]++;
			i++;
			if(i<10){
					System.out.println("Introduce nº del 0 al 9");
					numero = sc.nextInt();
				}
			
			
			}

		int j = 0;
		while(j<contador.length && i>0) {
			System.out.println("Hay " + contador[j] + " de este nº " + j);
			j++;
		}
		System.out.println("Adios");
	}
		//no tener que pedir 2 nº solo con 1 syso
}
