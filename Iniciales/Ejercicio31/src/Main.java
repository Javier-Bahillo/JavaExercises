import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Introduce por teclado un número n;
		 * a continuación, solicita al usuario que,teclee n números.
		 * Realiza la media de los números positivos, la media de
		 * los negativos y cuenta el número de ceros introducidos.
		 */
		//numero n que v a ser tamaño array
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un nº n que debera ser positivo");
		System.out.println("Introduce un 0 o nº negativo para salir");		
		int n = sc.nextInt();
		int sumaPositivos = 0;
		int contadorPositivos = 0;
		int sumaNegativos = 0;
		int contadorNegativos = 0;
		int contadorCeros = 0;
		
		if(n <=0) {
			System.out.println("Agur");
		}
		else {
			//pedir los n numeros introducidos al usuario y crear bucle			
			int[] numeros = new int[n];
			for (int i = 0; i < numeros.length; i++) {
				System.out.println("Introduzca un nº para almacenar y poder realizar el calculo");
				int numero = sc.nextInt();
				numeros[i] = numero;
				
			}
		
			//bucle para recorrer array y calcular medias
			for (int i = 0; i < numeros.length; i++) {
				if(numeros[i]<0) {
					sumaNegativos += numeros[i];
					contadorNegativos++;
				}else if(numeros[i]==0){
					contadorCeros++;
				}else {
					sumaPositivos += numeros[i];
					contadorPositivos++;
				}
			}
			if(contadorPositivos>0) {
				System.out.println("La media de nº positivos es = " + (float)sumaPositivos/contadorPositivos);
			}else {
				System.out.println("No hay nº positivos");
			}
			if(contadorNegativos>0) {
			System.out.println("La media de nº negativos es =" + (float)sumaNegativos/contadorNegativos);
			}else {
			System.out.println("No hay nº negativos");
			}
			System.out.println("La cantidad de 0 introducidos es =" + contadorCeros);
		}				
		//CASO 1
		//n vale 0 o negativo y el tamaño del array es 0,no se pueden meter nº,texto de invalidacion
		
		
		//CASO2
		//n es un nº positivo, se rellena el array con ese nº y se calculan las medias
				
	}
}