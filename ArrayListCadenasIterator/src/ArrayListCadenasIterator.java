import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListCadenasIterator {
	/*
	 * Crea la clase ArrayListCadenasIterator que recibe
	 * Strings por teclado hasta que se introduce un String en
	 * blanco y los va almacenando en un ArrayList.
	 * Cuando finaliza la introducción muestra el contenido del
	 * array por pantalla usando un objeto de tipo Iterator.
	 */
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        ArrayList<String> listaCadenas = new ArrayList<>();
        String cadena = "a";

        System.out.println("Introduce cadenas de texto hasta que dejes en blanco:");

        while (!cadena.isEmpty()) {
            System.out.print("Cadena: ");
            cadena = sc.nextLine();
            listaCadenas.add(cadena);
        }
      
        System.out.println("\nCadenas de la lista:");
        Iterator<String> it = listaCadenas.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}