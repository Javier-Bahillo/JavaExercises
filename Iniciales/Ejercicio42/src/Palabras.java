import java.util.Scanner;

public class Palabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe un programa que pida dos palabras. 
		 * El programa debe comprobar si la primera palabra
		 * termina en la segunda.
		 */
		
		Scanner sc = new Scanner(System.in);
		String palabra1 = "";
		String palabra2 = "";
		System.out.println("Introduce 2 palabras");
		System.out.println("1era palabra :");
		palabra1 = sc.next();
		System.out.println("2da palabra :");
		palabra2 = sc.next();
		
		
		if(palabra1.endsWith(palabra2)) {
			System.out.println("Si termina igual");
		}else {
			System.out.println("No termina igual");
		}
		if(palabra1.contains(palabra2)) {
		System.out.println("Si termina igual");
	}else {
		System.out.println("No termina igual");
	}
//		if(palabra1.toLowerCase().endsWith(palabra2.toLowerCase())) {
//			System.out.println("Si termina igual");
//		}else {
//			System.out.println("No termina igual");
//		}
	}

}
