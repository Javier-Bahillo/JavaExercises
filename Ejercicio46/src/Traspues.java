import java.util.Scanner;

public class Traspues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * .Realiza la clase Java Traspues que pide
		 *  la introducción de los datos de una matriz por pantalla,
		 *   traspone la matriz, y muestra la matriz traspuesta por pantalla.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los datos de una matriz por pantalla");
		System.out.println("Introduce las filas");
		int filas = sc.nextInt();
		System.out.println("Introduce las columnas");
		int columnas = sc.nextInt();
		String[][] matriz = new String[filas][columnas];
		
		for (int i = 0; i < filas; i++) {
			
			for (int j = 0; j < columnas; j++) {
				System.out.println("Introduce el dato");
				String dato = sc.next();
				matriz[i][j] = dato;
			}
		}
		
		String[][] matrizTraspuesta = new String[columnas][filas];
		
		for (int i = 0; i < filas; i++) {
			
			for (int j = 0; j < columnas; j++) {
				matrizTraspuesta[j][i] = matriz[i][j];
			}
			
		}
		
		//matriz original
		System.out.println("Matriz original" + "\n");
		for (int i = 0; i < filas; i++) {
					
					for (int j = 0; j < columnas; j++) {
						System.out.print(matriz[i][j] + " ");
					}
					System.out.print("\n");
				}
		
		//matriz traspuesta
		System.out.println("\nMatriz Traspuesta" + "\n");
		for (int i = 0; i < filas; i++) {
			
			for (int j = 0; j < columnas; j++) {
				System.out.print(matrizTraspuesta[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		
	}

}
