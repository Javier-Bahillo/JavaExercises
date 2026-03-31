import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * pide una cadena por teclado y muestra cada carácter en una línea,
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		String texto = new String();
		System.out.println("Introduce un texto para mostrarlo linea por linea");
		texto = sc.nextLine();
		
		int j= 0;
		for (int i = 0; i < texto.length(); i++) {	
			System.out.println(texto.substring(j, j++));
//			System.out.println(texto.charAt(i));
		}
		
	}

}
