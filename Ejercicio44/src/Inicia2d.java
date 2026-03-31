import java.util.Scanner;

public class Inicia2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realiza la clase Java Inicia2d que inicializa 
		 * una matriz de caracteres de 2 dimensiones con el carácter
		 * # y después la muestra por pantalla.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Matriz de 2 dimensiones");
		System.out.println("Introduce el nº de filas");
		int filas = sc.nextInt();
		System.out.println("Introduce el nº de columnas");
		int columnas = sc.nextInt();
		char[][] matriz = new char [filas][columnas];
	
		for (int i = 0; i < filas; i++) {
			
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = '#';
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.print("\n");
		}
		
		
		
	}

}
