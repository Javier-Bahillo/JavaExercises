import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe un programa que pida dos cadenas de texto y 
		 * muestre si la primera contiene a la segunda como subcadena.
		 */
		
		Scanner sc = new Scanner(System.in);
		String cadena1 = "";
		String cadena2 = "";
		System.out.println("Introduce 2 cadenas");
		System.out.println("1era palabra :");
		cadena1 = sc.nextLine();
		System.out.println("2da palabra :");
		cadena2 = sc.nextLine();
		
		if (cadena1.contains(cadena2)) {
			System.out.println("La 1º cadena contiene la 2º");
		} else {
			System.out.println("La 1º cadena no contiene la 2º");
		}
	}

}
