import java.util.Scanner;

public class MatrizTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realiza la clase Java MatrizTeclado que pide 
		 * la introducción de los datos de una matriz por teclado,
		 * (número de filas, número de columnas, y los datos de cada celda)
		 * y, después muestra la matriz por pantalla.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una matriz por teclado");
		System.out.println("Introduce filas");
		int filas = sc.nextInt();
		System.out.println("Introduce columnas");
		int columnas = sc.nextInt();
		String dato = "";
		String[][] matriz = new String[filas][columnas];
		
		for (int i = 0; i < filas; i++) {
			
			for (int j = 0; j < columnas; j++) {
				System.out.println("Introduce el dato");
				dato = sc.next();
				matriz[i][j] = dato;
			}
			
		}
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.print("\n");	
		}
		
	}

}
