import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * pide una cadena por teclado y la muestra invertida
		 */
		
		//String a = "a"
		//syso.... a + b + c
		
		Scanner sc = new Scanner(System.in);
		String texto = "";
		System.out.println("Introduce un texto para visualiarlo de forma inversa");
		texto = sc.nextLine();
		String texto2 = "";
		for (int i = texto.length()-1; i >= 0; i--) {
//			System.out.println(texto.charAt(i));
			texto2 += texto.charAt(i);
		}System.out.println(texto2);
	}

}
