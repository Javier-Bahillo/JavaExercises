import java.util.Scanner;

public class FraseNoSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escribe un programa que pida una frase y 
		 * muestre la misma frase pero sin ningún espacio.
		 */
		
		Scanner sc = new Scanner(System.in);
		String texto = "";
		String textoSinEspacios = "";
		System.out.println("Introduce un texto para visualizarlo sin ningún espacio");
		
		texto = sc.nextLine();
		System.out.println(texto.replace(" ", ""));
//		for (int i = 0; i < texto.length(); i++) {
//			if(texto.charAt(i) != ' ') {
//				textoSinEspacios += texto.charAt(i);
//			}
//		}
//		System.out.println(textoSinEspacios);
	}

}
