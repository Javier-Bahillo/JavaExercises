import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Crea la función muestraPares(int n) que muestre por consola los,
		 * primeros n números pares.
		 */	
		Scanner sc = new Scanner(System.in);
		System.out.println("Muestra pares en orden");
		System.out.println("Introduce el nº de pares que quieres mostrar");
		int numeroDePares = sc.nextInt();
		 
		 muestraPares(numeroDePares);
		
	}
	public static int muestraPares(int pares2) {
		for (int i = 0; i < pares2; i++) {
			System.out.println(i * 2);
		}
		return pares2;
		
	}

}
