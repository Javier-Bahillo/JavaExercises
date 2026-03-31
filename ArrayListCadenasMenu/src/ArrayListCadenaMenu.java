import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCadenaMenu {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crea la clase ArrayListCadenasMenu que muestra un menú
		 * por pantalla con las siguientes opciones para manipular
		 * Strings,
		 * -Añadir String. Pide un String y lo añade al array.
		 * -Buscar String. Pide un String y lo busca en el array.
		 * Muestra un mensaje con la posición en que se encuentra o
		 * un mensaje de error si no se encuentra en el array.
		 * -Borrar String. Pide un String y lo elimina, si es
		 * que existe, del array.
		 * -Listar Array. Muestra todos los elementos del array
		 * por pantalla, si es que tiene elementos.
		 * -Salir. Realiza las operaciones necesarias
		 * para la correcta finalización del programa.
		 */
		
		
        ArrayList<String> cadenas = new ArrayList<>();
        int cadena;
        System.out.println("Menu de cadenas");
        System.out.println("Opcion 1: Añadir String");
        System.out.println("Opcion 2: Buscar String");
        System.out.println("Opcion 3: Borrar String");
        System.out.println("Opcion 4: Listar Array");
        System.out.println("Opcion 5: Salir");
        int opciones = 0;
        opciones = sc.nextInt();
        sc.nextLine();
        switch (opciones) {
		case 1:
			aniadirString(cadenas, sc);
			break;
		case 2:
			buscarString(cadenas, sc);	
			break;
		case 3:
			borrarString(cadenas, sc);
			break;
		case 4:
			listarString(cadenas);
			break;
		case 5:
			System.out.println("Agur");
			break;

		default:
			break;
		}
       
	}
	
	 public static void aniadirString(ArrayList<String> cadenas, Scanner sc) {
	        System.out.print("Introduce una cadena para añadir: ");
	        String cadena = sc.nextLine();
	        cadenas.add(cadena);
	        System.out.println("Cadena añadida");
	    }

	    public static void buscarString(ArrayList<String> cadenas, Scanner sc) {
	        System.out.print("Introduce la cadena a buscar: ");
	        String cadena = sc.nextLine();
	        int indice = cadenas.indexOf(cadena);
	        if (indice != -1) {
	            System.out.println("La cadena se encuentra en la posición: " + indice);
	        } else {
	            System.out.println("La cadena no se encuentra en el array");
	        }
	    }

	    public static void borrarString(ArrayList<String> cadenas, Scanner sc) {
	        System.out.print("Introduce la cadena a borrar: ");
	        String cadena = sc.nextLine();
	        if (cadenas.remove(cadena)) {
	            System.out.println("Cadena eliminada");
	        } else {
	            System.out.println("No se ha encontrado");
	        }
	    }
	    
	    public static void listarString(ArrayList<String> cadenas) {
	        if (cadenas.isEmpty()) {
	            System.out.println("La lista está vacía");
	        } else {
	            System.out.println("Cadenas de la lista:");
	            for (int i = 0; i < cadenas.size(); i++) {
	                System.out.println(i + ": " + cadenas.get(i));
	            }
	        }
	    }
}