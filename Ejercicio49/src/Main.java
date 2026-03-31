import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realiza la clase Java Arraysum que solicita la introducción
		 * de una matriz de números enteros por teclado, calcula la
		 * suma de los elementos de cada una de las filas y
		 * mete el resultado de ese cálculo en un array.
		 * Después visualiza el contenido del array por pantalla.
		 */
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce el nº de filas: ");
	        int filas = sc.nextInt();
	        System.out.print("Introduce el nº de columnas: ");
	        int columnas = sc.nextInt();

	        int[][] matriz = new int[filas][columnas];
	        int[] sumaFilas = new int[filas];


	        System.out.println("Introduce los datos de la matriz:");
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                System.out.print("Dato " + i + j);
	                matriz[i][j] = sc.nextInt();
	            }
	        }

	        for (int i = 0; i < filas; i++) {
	           int suma = 0;
	            for (int j = 0; j < columnas; j++) {
	                suma += matriz[i][j];
	            }
	            sumaFilas[i] = suma;
	        }

	        System.out.println("La suma de cada fila es:");
	        for (int i = 0; i < sumaFilas.length; i++) {
	            System.out.println("Fila " + i + ": " + sumaFilas[i]);
	        }

	    }
	}