import java.util.Scanner;

public class Contavoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realiza la clase Java Contavoc que solicita la introducción de una
		 * cadena por teclado. Cuenta el número de veces que se ha introducido
		 * cada una de las vocales sin diferenciar entre mayúsculas y minúsculas
		 * utilizando un array, y muestra el número de veces que se
		 * ha introducido cada una de las vocales.
		 */
		
		Scanner sc = new Scanner(System.in);
		char[] vocales ={
			'a','e','i','o','u'
		};
		String texto = "";

		int[] contadorVocales = new int[5];
		System.out.println("Introduzca la cadena por teclado");
		texto = sc.nextLine().toLowerCase();
		
		for (int i = 0; i < texto.length(); i++) {
			
			for (int j = 0; j < vocales.length; j++) {
				if(texto.charAt(i)==(vocales[j])) {
					contadorVocales[j]++;
				}
			}
		}
		for (int i = 0; i < vocales.length; i++) {
			System.out.println("El nº de veces que aparece la letra " + vocales[i] + " es " + contadorVocales[i]);
		}
		
		
		}

}
