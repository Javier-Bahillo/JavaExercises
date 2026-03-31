import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCadenas {

	
	/*
	 * Crea la clase ArrayListCadenas que recibe Strings
	 * por teclado hasta que se introduce un String en blanco
	 * y los va almacenando en un ArrayList.
	 * Cuando finaliza la introducción muestra el contenido
	 * del array por pantalla.
	 */
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 ArrayList<String> listaStrings = new ArrayList<>();
		 String texto = "";
		 do {
			 System.out.println("Introduce una palabra");
			 texto = sc.next();
			 if(!texto.equals("-")) {
				 listaStrings.add(texto);
			
			 }
			
		} while (!texto.equals("-"));
		 
		 for (String palabra: listaStrings) {
			 System.out.println(palabra);
		}
		 
	}
}
