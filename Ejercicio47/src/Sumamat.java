import java.util.Scanner;

public class Sumamat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realiza la clase Java Sumamat que solicita
		 * la introducción de dos matrices de números enteros por teclado,
		 * calcula
		 * la suma de las dos matrices en otra matriz,
		 * y muestra la matriz resultado por pantalla.
		 */
		
		 Scanner sc = new Scanner(System.in);


	        System.out.print("Introduce el nº de filas: ");
	        int filas = sc.nextInt();
	        System.out.print("Introduce el nº de columnas: ");
	        int columnas = sc.nextInt();

	        int[][] matriz1 = new int[filas][columnas];
	        int[][] matriz2 = new int[filas][columnas];
	        int[][] suma = new int[filas][columnas];


	        System.out.println("Introduce los datos de la primera matriz:");
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                System.out.print("Dato" + i +  j);
	                matriz1[i][j] = sc.nextInt();
	            }
	        }

	        System.out.println("Introduce los datos de la segunda matriz:");
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                System.out.print("Dato" + i + j);
	                matriz2[i][j] = sc.nextInt();
	            }
	        }

	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                suma[i][j] = matriz1[i][j] + matriz2[i][j];
	            }
	        }
	        System.out.println("La matriz de la suma es:");
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                System.out.print(suma[i][j] + " ");
	            }
	            System.out.println();
	        }

	}

}
